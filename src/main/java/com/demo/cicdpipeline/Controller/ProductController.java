package com.demo.cicdpipeline.Controller;


import com.demo.cicdpipeline.DTO.ProductRequestDto;
import com.demo.cicdpipeline.DTO.ProductResponseDto;
import com.demo.cicdpipeline.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductResponseDto>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllPorductS());
    }

    @PostMapping("/create/products")
    public ResponseEntity<ProductResponseDto> createProduct(@RequestBody ProductRequestDto productRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.createproduct(productRequestDto));
    }



}
