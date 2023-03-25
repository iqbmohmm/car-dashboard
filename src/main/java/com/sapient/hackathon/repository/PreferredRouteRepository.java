package com.sapient.hackathon.repository;

import com.sapient.hackathon.entity.PreferredRouteEntity;
import com.sapient.hackathon.model.PreferredRouteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferredRouteRepository extends JpaRepository<PreferredRouteEntity, Long> {
    PreferredRouteEntity findByCustomerId(String customerId);
}
