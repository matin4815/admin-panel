package com.matin.adminpanel.service.presentation;

import com.matin.adminpanel.dto.ProductDisplayDto;
import com.matin.adminpanel.feign.ProductService;
import org.springframework.stereotype.Service;

@Service
public class PresentationServiceImpl implements PresentationService{

    private final ProductService productService;

    public PresentationServiceImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public Boolean productDisplay(ProductDisplayDto productDisplayDto) {
        return productService.changeProductDisplaySetting(productDisplayDto);
    }

}
