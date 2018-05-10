package com.belatrixsf.sprinbootservices.services;

import com.belatrixsf.sprinbootservices.model.Customer;
import java.util.Optional;

public interface CustomerService {

  Optional<Customer> getCustomer(Integer id);

}
