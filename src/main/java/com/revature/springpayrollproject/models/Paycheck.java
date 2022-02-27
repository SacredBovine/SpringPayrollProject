package com.revature.springpayrollproject.models;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "payroll")
public class Paycheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long checkNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    private Employee employee;

    @Column(name = "total")
    private double totalAmount;

    @Column(name = "tax")
    private double taxes;

    @Column(name = "additional_withholdings")
    private double otherWithholdings;

    private boolean approved;

    private boolean issued;

}
