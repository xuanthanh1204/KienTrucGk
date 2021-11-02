package com.example.shippingservice.repository;

import com.example.shippingservice.entity.Shiper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryShiper extends CrudRepository<Shiper,Integer> {
}
