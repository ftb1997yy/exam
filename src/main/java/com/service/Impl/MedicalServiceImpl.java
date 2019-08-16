package com.service.Impl;

import com.dao.MedicalDao;
import com.github.pagehelper.PageHelper;
import com.pojo.Medical;
import com.service.MedicalService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalServiceImpl implements MedicalService {

    @Autowired(required = false)
    private MedicalDao medicalDao;
    @Override
    public List<Medical> findAllMedical(String sort) {

        return medicalDao.findAll(sort);
    }

    @Override
    public List<Medical> medicalFindAllByPage(String sort,Integer page, Integer limit) {

        PageHelper.startPage(page,limit);

        List<Medical> list = medicalDao.medicalFindAllByPage(sort);

        return list;
    }

    @Override
    public void medicalUpdate(Medical medical) {
        medicalDao.medicalUpdate(medical);
    }

    @Override
    public Medical medicalFindOne(Integer id) {
        return medicalDao.medicalFindOne(id);
    }

    @Override
    public Medical medicalDelete(Integer id) {
        return medicalDao.medicalDelete(id);
    }

}
