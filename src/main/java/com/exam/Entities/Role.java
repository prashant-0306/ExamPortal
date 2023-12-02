package com.exam.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="roles")
public class Role {
    @Id
//    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long roleId;
    private String roleName;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy ="role")
    private Set<UserRole> userRoles=new HashSet<>();



}
