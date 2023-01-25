package com.bootcamp.demoboard.entity;


import com.bootcamp.demoboard.entity.sdo.BoardCdo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Id;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Board {

    @Id
    private String id;
    private String userId;
    private String title;
    private String content;
    private String password;
    private String date;
    private String hit;

    // 댓글 향후 추가

    public Board(BoardCdo boardCdo) {
        super();
        BeanUtils.copyProperties(boardCdo, this);
    }
}
