package com.sapient.hackathon.repository;

import com.sapient.hackathon.entity.BaseEntity;
import com.sapient.hackathon.entity.SafetyConcernEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SafetyConcernRepository extends JpaRepository<SafetyConcernEntity, Long> {
    SafetyConcernEntity findByCustomerId(String customerId);
}
