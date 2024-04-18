package com.demo.account.Repository;

import com.demo.account.Entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customers,Long>{
    Optional<Customers> findByMobileNumber(String mobileNumber);
}
