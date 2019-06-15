package com.chm.test.controllers.service;

import com.chm.test.beans.Bean;

@Bean
public class SalaryService {
    public Integer calSalary(Integer experience){
        return experience*5000;
    }
}
