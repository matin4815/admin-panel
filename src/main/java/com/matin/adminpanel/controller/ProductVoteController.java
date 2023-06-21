package com.matin.adminpanel.controller;

import com.matin.adminpanel.dto.ProductDisplayDto;
import com.matin.adminpanel.service.vote.ProductVoteService;
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
    public Boolean changeProductVoteSetting(@RequestBody @Valid ProductDisplayDto productDisplayDto) {
        return productVoteService.changeProductVoteSetting(productDisplayDto);
    }
}
