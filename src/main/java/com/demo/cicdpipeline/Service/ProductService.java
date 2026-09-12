package com.demo.cicdpipeline.Service;

import com.demo.cicdpipeline.DTO.ProductRequestDto;
import com.demo.cicdpipeline.DTO.ProductResponseDto;

import java.util.List;

public interface ProductService {

    ProductResponseDto createproduct(ProductRequestDto productRequestDto);

    List<ProductResponseDto> getAllPorductS();
}
