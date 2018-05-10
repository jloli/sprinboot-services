package com.belatrixsf.sprinbootservices.repositories;

import com.belatrixsf.sprinbootservices.model.Customer;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

  @Override
  Optional<Customer> findById(Integer id);

}
