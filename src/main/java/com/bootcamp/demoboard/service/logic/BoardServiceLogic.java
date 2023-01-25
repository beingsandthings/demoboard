package com.bootcamp.demoboard.service.logic;

import com.bootcamp.demoboard.entity.Board;
import com.bootcamp.demoboard.service.BoardService;
import com.bootcamp.demoboard.store.BoardStore;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceLogic implements BoardService {

    private final BoardStore boardStore;

    public BoardServiceLogic(BoardStore boardStore) {
        this.boardStore = boardStore;
    }


    @Override
    public String register(Board newBoard) {
        // validate 추가
        return boardStore.create(newBoard);
    }

    @Override
    public void modify(Board newBoard) {
        boardStore.update(newBoard);
    }

    @Override
    public void remove(String id) {
        boardStore.delete(id);
    }

    @Override
    public Board find(String id) {
        return boardStore.retrieve(id);
    }

    @Override
    public List<Board> findAll() {
        return boardStore.retrieveAll();
    }
}
