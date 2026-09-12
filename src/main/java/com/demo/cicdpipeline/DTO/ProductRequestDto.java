package com.demo.cicdpipeline.DTO;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductRequestDto {
    private  String name;
    private  String description;
}
