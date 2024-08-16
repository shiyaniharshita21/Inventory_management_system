package com.message.inventory.repositories;

import com.message.inventory.model.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    @Modifying
    @Transactional
    @Query(value = "update tblproduct set inventory_stoke = inventory_stoke + ?1 where product_id = ?2",nativeQuery = true)
    int updateStock(int stock,int id);

    @Modifying
    @Transactional
    @Query(value = "update tblproduct set sold = 0 where sold > 0",nativeQuery = true)
    void updateSold();
}
