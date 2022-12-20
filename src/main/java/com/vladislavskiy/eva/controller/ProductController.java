package com.vladislavskiy.eva.controller;

import com.vladislavskiy.eva.model.Product;
import com.vladislavskiy.eva.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Pattern;

@RestController
@Slf4j
@RequestMapping("/shop")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(@RequestParam String nameFilter)
    {
        log.info("LOG: "+ nameFilter);
        return productService.findAllProductsByRegName(nameFilter);
    }
}
