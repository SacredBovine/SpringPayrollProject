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

        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent())
            return employee.get();
        else return null;
    }

    public List<Employee> findEmployeeByRole(int id) {
        return employeeRepository.findEmployeesByRole_RoleId(id);
    }

    public List<Employee> findEmployeeByDept(int departmentId){
       return employeeRepository.findEmployeesByDepartment_DepartmentId(departmentId);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
