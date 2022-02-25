package com.revature.springpayrollproject.controllers;

import com.revature.springpayrollproject.models.Employee;
import com.revature.springpayrollproject.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController("employeeController")
@RequestMapping("employee")
@CrossOrigin( value = "http://localhost:4200") // for inevitable Angular
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

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

}
