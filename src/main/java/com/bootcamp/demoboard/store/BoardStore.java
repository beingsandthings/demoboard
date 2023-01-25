package com.bootcamp.demoboard.store;

import com.bootcamp.demoboard.entity.Board;
import com.bootcamp.demoboard.entity.User;

import java.util.List;

public interface BoardStore {

    String create(Board newBoard);
    void update(Board newBoard);
    void delete(String id);

    Board retrieve(String id);
    List<Board> retrieveAll();
}
