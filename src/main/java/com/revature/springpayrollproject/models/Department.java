package com.revature.springpayrollproject.models;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department {
    @Id
    @Column(name = "department_id")
    private int departmentId;
    @Column(name = "department_name")
    private String departmentName;
}
