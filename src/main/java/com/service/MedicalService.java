package com.service;

import com.pojo.Medical;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicalService {

    public List<Medical> findAllMedical(String sort);

    public List<Medical> medicalFindAllByPage( String sort,Integer page,Integer limit);

    public void medicalUpdate(Medical medical);

    public Medical medicalFindOne(Integer id);


    public Medical medicalDelete(Integer id);

}
