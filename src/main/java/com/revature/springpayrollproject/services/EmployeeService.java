package com.revature.springpayrollproject.services;

import com.revature.springpayrollproject.models.Employee;
import com.revature.springpayrollproject.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee createEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(Employee employee){
        employeeRepo.delete(employee);
    }

    public Employee findEmployeeById(int id){
        return employeeRepo.getById(id);
    }

    public List<Employee> findEmployeeByRole(int id){
        return employeeRepo.findEmployeesByRole_RoleId(id);
    }

    public List<Employee> findEmployeeByDept(int id){
        return employeeRepo.findEmployeesByDepartment_DepartmentId(id);
    }

}
