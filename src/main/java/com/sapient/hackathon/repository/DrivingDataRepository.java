package com.sapient.hackathon.repository;

import com.sapient.hackathon.entity.DrivingDataEntity;
import com.sapient.hackathon.model.DrivingDataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrivingDataRepository extends JpaRepository<DrivingDataEntity, Long> {
    DrivingDataEntity findByCustomerId(String customerId);
}
