package com.bootcamp.demoboard.store.mongo.odm;

import com.bootcamp.demoboard.entity.Board;
import com.bootcamp.demoboard.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "BOARD")
public class BoardDoc {

    @Id
    private String id;
    private String userId;
    private String title;
    private String content;
    private String password;
    private String date;
    private String hit;

    public BoardDoc(Board newBoard) {
        super();
        BeanUtils.copyProperties(newBoard, this);
    }

    public Board toDomain() {
        Board board = new Board();
        BeanUtils.copyProperties(this, board);
        return board;
    }
}
