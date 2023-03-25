package com.sapient.hackathon.controller;

import com.google.common.collect.Lists;
import com.sapient.hackathon.enums.FileType;
import com.sapient.hackathon.entity.SafetyConcernEntity;
import com.sapient.hackathon.repository.SafetyConcernRepository;
import com.sapient.hackathon.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class FileController {

    @Autowired
    SafetyConcernRepository safetyConcernRepository;

    @PostMapping
    public String uploadFile(@RequestParam FileType fileType) throws IOException {
        List<SafetyConcernEntity> safetyConcernEntities = FileUtil.extractFile(fileType);
        List<List<SafetyConcernEntity>> partition = Lists.partition(safetyConcernEntities, 10);
        partition.forEach(it -> {
            safetyConcernRepository.saveAllAndFlush(it);
        });
        return "yeah. done!";
    }
}
