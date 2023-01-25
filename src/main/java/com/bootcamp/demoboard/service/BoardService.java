package com.bootcamp.demoboard.service;

import com.bootcamp.demoboard.entity.Board;
import com.bootcamp.demoboard.entity.User;

import java.util.List;

public interface BoardService {

    String register(Board newBoard);
    void modify(Board newBoard);
    void remove(String id);

    Board find(String id);
    List<Board> findAll();
}
