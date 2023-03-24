package com.sapient.hackathon.service;

import com.sapient.hackathon.entity.BaseEntity;
import com.sapient.hackathon.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseService {

    @Autowired
    private BaseRepository baseRepository;

    public BaseEntity getById(Long id) {
        return baseRepository.getById(id);
    }

    public List<BaseEntity> getAll() {
        return baseRepository.findAll();
    }

    public BaseEntity create(BaseEntity baseEntity) {
        return baseRepository.save(baseEntity);
    }

    public BaseEntity update(BaseEntity baseEntity) {
        return baseRepository.save(baseEntity);
    }
}
