package com.elwgomes.project.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_product")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUr;

    @Transient
    private Set<Category> categories = new HashSet<>();

    private Product () {
        //empty constructor
    }

    public Product(Long id, String name, String description, Double price, String imgUr) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUr = imgUr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgUr() {
        return imgUr;
    }

    public void setImgUr(String imgUr) {
        this.imgUr = imgUr;
    }

    public Product(Set<Category> categories) {
        this.categories = categories;
    }

}
