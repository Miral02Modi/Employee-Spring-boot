package com.example.demo.service.impl;

import com.example.demo.dto.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Employee getEmployeeDetails(Long id) {
        com.example.demo.entity.Employee employee = employeeRepository.findBySalary("1000").get();
        Employee employeeDTO = new Employee();
        BeanUtils.copyProperties(employee,employeeDTO);
        return employeeDTO;
    }
}
