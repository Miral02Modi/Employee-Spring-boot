package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    public Optional<Employee> findById(Long id);

    public Optional<Employee> findBySalary(String salary);

    public Optional<Employee> findByName(String name);
 }
