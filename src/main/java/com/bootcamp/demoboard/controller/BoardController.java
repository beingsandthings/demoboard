package com.bootcamp.demoboard.controller;

import com.bootcamp.demoboard.entity.Board;
import com.bootcamp.demoboard.entity.sdo.BoardCdo;
import com.bootcamp.demoboard.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("board")
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }


//    @PostMapping
//    public ResponseEntity<?> registerBoard(@RequestBody BoardCdo boardCdo) {
////        try {
////
////            Board board = new Board(boardCdo);
////
////            String boardId = boardService.register(board);
////
////            return
////        } catch (Exception e) {
////
////        }
//
//        return
//    }




}
