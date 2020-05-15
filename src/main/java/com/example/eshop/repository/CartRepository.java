package com.example.eshop.repository;

import com.example.eshop.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

    Cart findByUserId(int i );

    List<Cart> findAllByUserId(int i);


}
