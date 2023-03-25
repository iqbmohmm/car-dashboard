package com.sapient.hackathon.repository;

import com.sapient.hackathon.entity.CustomerBehaviourEntity;
import com.sapient.hackathon.model.CustomerBehaviourModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBehaviourRepository extends JpaRepository<CustomerBehaviourEntity, Long> {
    CustomerBehaviourEntity findByCustomerId(String customerId);
}
