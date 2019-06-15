package com.chm.test.controllers;

import com.chm.test.beans.AutoWired;
import com.chm.test.controllers.service.SalaryService;
import com.chm.test.web.mvc.Controller;
import com.chm.test.web.mvc.RequestMapping;
import com.chm.test.web.mvc.RequestParam;

@Controller
public class SalaryController {
    @AutoWired
    private SalaryService salaryService;
    @RequestMapping("/get_salary.json")
    public String getSalary(@RequestParam("name") String name,@RequestParam("experience") String experience){
        return "hello,"+name+salaryService.calSalary(Integer.parseInt(experience));
    }
}
