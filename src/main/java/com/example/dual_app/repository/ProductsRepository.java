package com.example.dual_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dual_app.entity.Products;


@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {


}
