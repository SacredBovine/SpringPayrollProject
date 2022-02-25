package com.revature.springpayrollproject.controllers;

import com.revature.springpayrollproject.models.Employee;
import com.revature.springpayrollproject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController("employeeController")
@RequestMapping("employee")
@CrossOrigin( value = "http://localhost:4200") // for inevitable Angular
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("id/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int employeeId){

        return new ResponseEntity<>(employeeService.findEmployeeById(employeeId), HttpStatus.FOUND);
    }

    @PutMapping
    public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee){
        if (employee == employeeService.updateEmployee(employee)){ // there is better logic to be used
            return new ResponseEntity<>(null, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){

        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping("role.{roleId}")
    public ResponseEntity<List<Employee>> findEmployeesByRole(@PathVariable int roleId){
        List<Employee> employees = employeeService.findEmployeeByRole(roleId);
        if (!employees.isEmpty()){
            return new ResponseEntity<>(employees, HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("department/{departmentId}")
    public ResponseEntity<List<Employee>> findEmployeesByDepartment(@PathVariable int departmentId){
        List<Employee> employees = employeeService.findEmployeeByDept(departmentId);
        if (!employees.isEmpty()){
            return new ResponseEntity<>(employees, HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}
