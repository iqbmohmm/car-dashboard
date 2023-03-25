package com.sapient.hackathon.service;

import com.sapient.hackathon.entity.BaseEntity;
import com.sapient.hackathon.entity.SafetyConcernEntity;
import com.sapient.hackathon.repository.BaseRepository;
import com.sapient.hackathon.repository.SafetyConcernRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SafetyConcernService {

    @Autowired
    private SafetyConcernRepository safetyConcernRepository;

    public SafetyConcernEntity getById(String id) {
        return safetyConcernRepository.findByCustomerId(id);
    }

    public List<SafetyConcernEntity> getAll() {
        return safetyConcernRepository.findAll();
    }

    public SafetyConcernEntity create(SafetyConcernEntity baseEntity) {
        return safetyConcernRepository.save(baseEntity);
    }

    public SafetyConcernEntity update(SafetyConcernEntity baseEntity) {
        return safetyConcernRepository.save(baseEntity);
    }
}
