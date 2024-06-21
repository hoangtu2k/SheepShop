package com.example.sheepshop.model;


import com.example.sheepshop.entitys.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductReq {

    private Long id;
    private Brand brand;
    private CollarStyle collarStyle;
    private Color color;
    private Size size;
    private Material material;
    private Category category;
    private Image image;
    private String code;
    private String name;
    private Integer quantity;
    private BigDecimal price;
    private String description;
    private Integer status;

}
