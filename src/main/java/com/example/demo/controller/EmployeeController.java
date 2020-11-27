package com.example.demo.controller;

import com.example.demo.dto.Employee;
import com.example.demo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    IEmployeeService iEmployeeService;

    @RequestMapping(value = "/getEmployee/{id}",method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public @ResponseBody Employee getEmployeeDetails(@PathVariable(value = "id",required = true) Long id){
        return iEmployeeService.getEmployeeDetails(id);
    }
}
