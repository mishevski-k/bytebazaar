package com.bytebazzar.rest.v1.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String sku;
    private String description;
    private Float price;
    private String currency;
    private int quantityAvailable;
    private Long categoryId;
    private Long brandId;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    private Date modifiedAt;
    private Date deletedAt;
    private Long modifiedBy;
    private Long createdBy;
}
