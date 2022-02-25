package com.revature.springpayrollproject.repos;

import com.revature.springpayrollproject.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    /**
     * @param id integer value of department id
     * @return list of employees in the department matching PK to param
     */
    public List<Employee> findEmployeesByDepartment_DepartmentId(int id);

    /**
     * @param id integer value of role id
     * @return list of employees with role mathing PK to param
     */
    public List<Employee> findEmployeesByRole_RoleId(int id);

}
