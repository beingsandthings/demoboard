package com.bootcamp.demoboard.store.mongo;

import com.bootcamp.demoboard.entity.Board;
import com.bootcamp.demoboard.store.BoardStore;
import com.bootcamp.demoboard.store.mongo.odm.BoardDoc;
import com.bootcamp.demoboard.store.mongo.repository.BoardMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class BoardMongoStore implements BoardStore {

    private final BoardMongoRepository boardMongoRepository;

    public BoardMongoStore(BoardMongoRepository boardMongoRepository) {
        this.boardMongoRepository = boardMongoRepository;
    }

    @Override
    public String create(Board newBoard) {
        BoardDoc boardDoc = new BoardDoc(newBoard);
        boardMongoRepository.save(boardDoc);
        return newBoard.getId();
    }

    @Override
    public void update(Board newBoard) {
        //
        BoardDoc boardDoc = new BoardDoc(newBoard);
        boardMongoRepository.save(boardDoc);
    }

    @Override
    public void delete(String id) {
        //
        this.boardMongoRepository.deleteById(id);
    }

    @Override
    public Board retrieve(String id) {
        //
        Optional<BoardDoc> boardDoc = boardMongoRepository.findById(id);
        return boardDoc.map(BoardDoc::toDomain).orElse(null);
    }

    @Override
    public List<Board> retrieveAll() {
        //
        List<BoardDoc> boardDocList = boardMongoRepository.findAll();
        return boardDocList.stream().map(BoardDoc::toDomain).collect(Collectors.toList());
    }
}
