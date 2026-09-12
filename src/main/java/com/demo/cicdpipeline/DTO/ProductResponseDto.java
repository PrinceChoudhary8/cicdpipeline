package com.demo.cicdpipeline.DTO;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ProductResponseDto {

    private  Long id;
    private  String name;
    private  String description;
}
