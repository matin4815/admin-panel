package com.matin.adminpanel.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductDisplayDto {

    private Long productId;

    @NotNull
    private Boolean enable;

}
