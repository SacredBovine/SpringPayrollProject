package com.revature.springpayrollproject.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role implements Serializable {

    @Id
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "role_name")
    private String roleName;

}
