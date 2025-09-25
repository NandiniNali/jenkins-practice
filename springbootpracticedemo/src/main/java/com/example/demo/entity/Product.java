package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_table")
public class Product {

    @Id
    @Column(name = "product_id")
    private int id;

    @Column(name = "product_name", nullable = false, length = 50)
    private String name;

    @Column(name = "product_category", nullable = false, length = 30)
    private String category;

    @Column(name = "product_cost", nullable = false)
    private double cost;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // toString
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", category=" + category + ", cost=" + cost + "]";
    }
}
