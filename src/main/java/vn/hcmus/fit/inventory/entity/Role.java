package vn.hcmus.fit.inventory.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Asus on 11/9/2019.
 */
@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "role_name", nullable = false, length = 50)
    private String roleName;

    @Basic
    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Basic
    @Column(name = "active_flag", nullable = false)
    private int activeFlag;

    @Basic
    @Column(name = "create_date", nullable = false)
    private Timestamp createDate;

    @Basic
    @Column(name = "update_date", nullable = false)
    private Timestamp updateDate;

    @OneToMany(mappedBy = "roleByRoleId")
    private Set<Auth> authsById = new HashSet<>();

    @OneToMany(mappedBy = "roleByRoleId")
    private Set<UserRole> userRolesById = new HashSet<>();
}
