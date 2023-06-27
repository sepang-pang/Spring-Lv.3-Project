package com.sparta.learnspring.dto;

import com.sparta.learnspring.entity.Post;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseDto {
    private String username;
    private String title;
    private String contents;
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public ResponseDto(Post post) {
        this.username = post.getUsername();
        this.title = post.getTitle();
        this.contents = post.getContents();
        this.id = post.getId();
        this.createdAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
    }


}
