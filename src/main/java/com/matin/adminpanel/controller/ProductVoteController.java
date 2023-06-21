package com.matin.adminpanel.controller;

import com.matin.adminpanel.dto.ChangeVoteStatusDto;
import com.matin.adminpanel.dto.ProductDisplayDto;
import com.matin.adminpanel.service.vote.ProductVoteService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product-vote")
@CrossOrigin("*")
public class ProductVoteController {

    private final ProductVoteService productVoteService;

    public ProductVoteController(ProductVoteService productVoteService) {
        this.productVoteService = productVoteService;
    }

    @PostMapping("/setting")
    @Operation(summary = "Product vote condition"
            , description = "This api determines whether a product can have vote ro not")
    public Boolean changeProductVoteSetting(@RequestBody @Valid ProductDisplayDto productDisplayDto) {
        return productVoteService.changeProductVoteSetting(productDisplayDto);
    }

    @PostMapping("/change-status")
    @Operation(summary = "Vote acceptance"
            , description = "This api changes a products vote acceptance status")
    public Boolean changeVotesStatus(@RequestBody @Valid ChangeVoteStatusDto changeVoteStatusDto) {
        return productVoteService.changeVotesStatus(changeVoteStatusDto);
    }
}
