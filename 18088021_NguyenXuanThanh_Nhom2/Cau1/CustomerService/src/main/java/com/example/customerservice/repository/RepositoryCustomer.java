package com.example.customerservice.repository;


import com.example.customerservice.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCustomer extends CrudRepository<Customer,Integer> {
}
