package com.matin.adminpanel.controller;

import com.matin.adminpanel.dto.ChangeCommentStatusDto;
import com.matin.adminpanel.dto.ProductDisplayDto;
import com.matin.adminpanel.service.comment.ProductCommentService;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary = "Product Comment setting"
            , description = "This api changes a products comment setting, so that a product may have comment or not")
    public Boolean changeProductCommentSetting(@RequestBody @Valid ProductDisplayDto productDisplayDto) {
        return productComment.changeProductCommentSetting(productDisplayDto);
    }

    @PostMapping("/change-status")
    @Operation(summary = "Comment acceptance"
            , description = "This api changes a products comment acceptance status")
    public Boolean changeCommentsStatus(@RequestBody @Valid ChangeCommentStatusDto changeCommentStatusDto) {
        return productComment.changeCommentsStatus(changeCommentStatusDto);
    }
}
