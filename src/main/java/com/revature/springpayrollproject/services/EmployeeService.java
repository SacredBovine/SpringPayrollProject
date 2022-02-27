package com.revature.springpayrollproject.services;

import com.revature.springpayrollproject.models.Department;
import com.revature.springpayrollproject.models.Employee;
import com.revature.springpayrollproject.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<Employee> findEmployeeByRole(int id) throws IllegalStateException{

        Optional<List<Employee>> employees = Optional.ofNullable(employeeRepository.findEmployeesByRole_RoleId(id));
        if (employees.isPresent()){
            return employees.get();
        } else throw new IllegalStateException("Employees not found");
    }

    public List<Employee> findEmployeeByDept(int departmentId) throws IllegalStateException{

       Optional<List<Employee>> employees = Optional.ofNullable(employeeRepository.findEmployeesByDepartment_DepartmentId(departmentId));
       if (employees.isPresent()){
           return employees.get();
       } else throw new IllegalStateException("Employees not found");
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
