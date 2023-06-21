package com.matin.adminpanel.feign;

import com.matin.adminpanel.dto.ProductDisplayDto;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "product-service", url = "localhost:8181")
public interface ProductService {

    @PostMapping("/products/display")
    Boolean changeProductDisplaySetting(@RequestBody @Valid ProductDisplayDto productDisplayDto);

    @PostMapping("/products/comment/option")
    Boolean changeProductCommentSetting(@RequestBody @Valid ProductDisplayDto productDisplayDto);

    @PostMapping("/products/vote/option")
    Boolean changeProductVoteSetting(@RequestBody @Valid ProductDisplayDto productDisplayDto);

}
