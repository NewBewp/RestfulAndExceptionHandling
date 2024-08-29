package com.example.RestfulAndExceptionHandling.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_roles")
public class RoleEntity extends EntityDefine {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;

}
