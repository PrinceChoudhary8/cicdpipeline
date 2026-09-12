package com.demo.cicdpipeline.Service.IMPL;

import com.demo.cicdpipeline.DTO.ProductRequestDto;
import com.demo.cicdpipeline.DTO.ProductResponseDto;
import com.demo.cicdpipeline.Entity.ProductEntity;
import com.demo.cicdpipeline.Repository.ProductRepository;
import com.demo.cicdpipeline.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductResponseDto createproduct(ProductRequestDto productRequestDto) {

        ProductEntity productEntity= ProductEntity.builder()
                .name(productRequestDto.getName())
                .description(productRequestDto.getDescription())
                .build();



     ProductEntity saveproduct=  productRepository.save(productEntity);

     return ProductResponseDto.builder().name(saveproduct.getName()).description(saveproduct.getDescription()).id(saveproduct.getId()).build();

    }

    @Override
    public List<ProductResponseDto> getAllPorductS() {

        List<ProductEntity> productEntities= productRepository.findAll();

        return productEntities.stream().map((p)-> ProductResponseDto.builder().name(p.getName()).description(p.getDescription()).id(p.getId()).build()).toList();
    }
}
