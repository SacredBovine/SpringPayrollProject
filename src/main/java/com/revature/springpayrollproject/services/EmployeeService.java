package com.revature.springpayrollproject.services;

import com.revature.springpayrollproject.models.Employee;
import com.revature.springpayrollproject.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Employee employee){
        employeeRepository.delete(employee);
    }

    public Employee findEmployeeById(int id){
        return employeeRepository.getById(id);
    }

    public List<Employee> findEmployeeByRole(int id){
        return employeeRepository.findEmployeesByRole_RoleId(id);
    }

    public List<Employee> findEmployeeByDept(int id){
        return employeeRepository.findEmployeesByDepartment_DepartmentId(id);
    }

}
