package com.matin.adminpanel.service.vote;

import com.matin.adminpanel.dto.ChangeVoteStatusDto;
import com.matin.adminpanel.dto.ProductDisplayDto;
import com.matin.adminpanel.feign.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductVoteServiceImpl implements ProductVoteService{

    private final ProductService productService;

    public ProductVoteServiceImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public Boolean changeProductVoteSetting(ProductDisplayDto productDisplayDto) {
        return productService.changeProductVoteSetting(productDisplayDto);
    }

    @Override
    public Boolean changeVotesStatus(ChangeVoteStatusDto changeVoteStatusDto) {
        return productService.changeVoteStatus(changeVoteStatusDto);
    }
}
