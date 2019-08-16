package com.service.Impl;

import com.dao.SubjectDao;
import com.pojo.Subject;
import com.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired(required = false)
    private SubjectDao subjectDao;
    @Override
    public List<Subject> findAllSubject() {
        return subjectDao.findAll();
    }
}
