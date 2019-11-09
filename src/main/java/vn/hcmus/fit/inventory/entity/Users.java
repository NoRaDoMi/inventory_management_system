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
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;


    @Basic
    @Column(name = "password", nullable = false, length = 100)
    private String password;


    @Basic
    @Column(name = "email", nullable = true, length = 100)
    private String email;

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    private String name;


    @Basic
    @Column(name = "active_flad", nullable = false)
    private int activeFlad;

    @Basic
    @Column(name = "create_date", nullable = false)
    private Timestamp createDate;

    @Basic
    @Column(name = "update_date", nullable = false)
    private Timestamp updateDate;

    @OneToMany(mappedBy = "usersByUserId")
    private Set<UserRole> userRolesById = new HashSet<>();

//    public void setUserRolesById(Collection<UserRole> userRolesById) {
//        this.userRolesById = userRolesById;
//    }
}
