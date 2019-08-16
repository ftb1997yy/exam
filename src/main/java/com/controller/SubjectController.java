package com.controller;


import com.pojo.Subject;
import com.service.SubjectService;
import com.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/subject")
@ResponseBody
public class SubjectController {

    @Autowired(required = false)
    private SubjectService subjectService;
    @RequestMapping("/list.do")
    public JsonResult findAllSubject() {
        List<Subject> list = subjectService.findAllSubject();

        return new JsonResult(1,list);
    }

}
