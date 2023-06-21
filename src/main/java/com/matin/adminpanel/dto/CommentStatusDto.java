package com.matin.adminpanel.dto;

import com.matin.adminpanel.enums.CommentState;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CommentStatusDto {

    @NotNull
    private Long id;

    @NotBlank
    private CommentState commentState;

}
