package com.revature.springpayrollproject.models;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department implements Serializable {
    @Id
    @Column(name = "department_id")
    private int departmentId;
    @Column(name = "department_name")
    private String departmentName;
}
