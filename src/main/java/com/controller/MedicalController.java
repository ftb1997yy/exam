package com.controller;

import com.github.pagehelper.Page;
import com.pojo.Medical;
import com.service.MedicalService;
import com.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
@RequestMapping("/medical")
public class MedicalController {


    @Autowired(required = false)
    private MedicalService medicalService;

    @RequestMapping("/list.do")
    public JsonResult findAllMedical(String sort) {


        List<Medical> list = medicalService.findAllMedical(sort);

        return new JsonResult(1,list);
    }

    @RequestMapping("/page.do")
    public Map<String,Object> medicalFindAllByPage(String sort,Integer page, Integer limit) {


        List<Medical> list = medicalService.medicalFindAllByPage(sort,page, limit);

        long total = ((Page)list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;

    }

    @RequestMapping("/delete.do")
    public JsonResult medicalDelete(Integer id) {
        medicalService.medicalDelete(id);

        return new JsonResult(1,null);
    }

    @RequestMapping("/query.do")
    public JsonResult medicalFindOne(Integer id) {
        Medical medical = medicalService.medicalFindOne(id);

        return new JsonResult(1,medical);
    }

    @RequestMapping("/update.do")
    public JsonResult medicalUpdate(Medical medical) {
        medicalService.medicalUpdate(medical);

        return new JsonResult(1,null);
    }

//    @RequestMapping("/find.do")
//    public JsonResult findOne(Medical medical) {
//        Medical one = medicalService.findOne(medical);
//        System.out.println(one);
//        return new JsonResult(1, one);
//    }
}
