package com.revature.springpayrollproject.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Employee {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;

    @Column(name = "salary")
    private double salary;


    public Employee(String firstName, String lastName, Department department, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.role = role;
    }
}
