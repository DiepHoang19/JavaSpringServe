package com.example.practical.service;

import com.example.practical.entity.Employee;
import com.example.practical.reponsitory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmlployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(Integer id) {
        return employeeRepository.findById(id);
    }

    public Employee save(Employee stock) {
        return employeeRepository.save(stock);
    }

    public void deleteById(Integer id) {
        employeeRepository.deleteById(id);
    }
}
