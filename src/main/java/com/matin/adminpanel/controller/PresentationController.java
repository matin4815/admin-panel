package com.matin.adminpanel.controller;

import com.matin.adminpanel.dto.ProductDisplayDto;
import com.matin.adminpanel.service.presentation.PresentationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/presentation")
@CrossOrigin("*")
public class PresentationController {

    private final PresentationService presentationService;

    public PresentationController(PresentationService presentationService) {
        this.presentationService = presentationService;
    }

    @PostMapping("/products")
    public Boolean productDisplay(@RequestBody @Valid ProductDisplayDto productDisplayDto) {
        return presentationService.productDisplay(productDisplayDto);
    }
}
