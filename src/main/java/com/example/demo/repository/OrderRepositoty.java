package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.Order;

public interface OrderRepositoty extends CrudRepository<Order, String>,PagingAndSortingRepository<Order, String> {

}
