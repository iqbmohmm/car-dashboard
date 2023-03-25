package com.sapient.hackathon.repository;

import com.sapient.hackathon.entity.DrivingDataEntity;
import com.sapient.hackathon.entity.MusicPreferenceEntity;
import com.sapient.hackathon.model.MusicPreferenceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicPreferenceRepository extends JpaRepository<MusicPreferenceEntity, Long> {
    MusicPreferenceEntity findByCustomerId(String customerId);
}
