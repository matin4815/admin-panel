package com.matin.adminpanel.service.comment;

import com.matin.adminpanel.dto.ProductDisplayDto;
import com.matin.adminpanel.feign.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductCommentServiceImpl implements ProductCommentService {

    private final ProductService productService;

    public ProductCommentServiceImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public Boolean changeProductCommentSetting(ProductDisplayDto productDisplayDto) {
        return productService.changeProductCommentSetting(productDisplayDto);
    }

}
