package com.dao;

import com.pojo.Medical;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicalDao {

   public List<Medical> findAll(@Param("sort") String sort);


   public List<Medical> medicalFindAllByPage(@Param("sort") String sort);

   public void medicalUpdate(Medical medical);

   public Medical medicalFindOne(Integer id);


   public Medical medicalDelete(Integer id);


}
