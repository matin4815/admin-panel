package com.matin.adminpanel.controller;

import com.matin.adminpanel.dto.ChangeCommentStatusDto;
import com.matin.adminpanel.dto.ProductDisplayDto;
import com.matin.adminpanel.service.comment.ProductCommentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product-comment")
@CrossOrigin("*")
public class ProductCommentController {

    private final ProductCommentService productComment;

    public ProductCommentController(ProductCommentService productComment) {
        this.productComment = productComment;
    }

    @PostMapping("/setting")
    public Boolean changeProductCommentSetting(@RequestBody @Valid ProductDisplayDto productDisplayDto) {
        return productComment.changeProductCommentSetting(productDisplayDto);
    }

    @PostMapping("/change-status")
    public Boolean changeCommentsStatus(@RequestBody @Valid ChangeCommentStatusDto changeCommentStatusDto) {
        return productComment.changeCommentsStatus(changeCommentStatusDto);
    }
}
