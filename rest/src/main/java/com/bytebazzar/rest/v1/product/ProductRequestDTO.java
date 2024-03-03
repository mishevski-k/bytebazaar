package com.bytebazzar.rest.v1.product;

import lombok.Builder;
import lombok.Data;
import org.joda.time.DateTime;

@Data
@Builder
public class ProductRequestDTO {
    private String name;
    private String description;
    private String sku;
    private Float price;
    private String currency;
    private Long categoryId;
    private Long brandId;

    public Product toProduct(){
        return Product.builder()
                .name(this.name)
                .description(this.description)
                .sku(this.sku)
                .price(this.price)
                .currency(this.currency)
                .categoryId(this.categoryId)
                .brandId(this.brandId).build();
    }
}
