package com.justt1n.cfshop.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="tmp_products")
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1 //increment by 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long id;
    @Column(nullable = false, unique = true, length = 300)
    private String name;
    private String type;
    private Double price;
    private String url;
    private String description;

    public Product() {

    }

    public Product(Long id, String name, String type, Double price, String url, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.url = url;
        this.description = description;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void updateFields(Product newProduct) {
        this.setName(newProduct.getName());
        this.setType(newProduct.getType());
        this.setPrice(newProduct.getPrice());
        this.setUrl(newProduct.getUrl());
        this.setDescription(newProduct.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}