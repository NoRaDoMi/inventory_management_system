package vn.hcmus.fit.inventory.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by Asus on 11/9/2019.
 */
@Data
@Entity
@Table
public class Auth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "permission", nullable = false)
    private int permission;

    @Basic
    @Column(name = "active_flag", nullable = false)
    private int activeFlag;

    @Basic
    @Column(name = "create_date", nullable = false)
    private Timestamp createDate;

    @Basic
    @Column(name = "update_date", nullable = false)
    private Timestamp updateDate;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)
    private Role roleByRoleId;

    @ManyToOne
    @JoinColumn(name = "menu_id", referencedColumnName = "id", nullable = false)
    private Menu menuByMenuId;

}
