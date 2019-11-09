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
@Table(name = "product_info", schema = "inventory_management")
public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Basic
    @Column(name = "code", nullable = false, length = 50)
    private String code;

    @Basic
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Basic
    @Column(name = "img", nullable = false, length = 200)
    private String img;

    @Basic
    @Column(name = "active_flag", nullable = false)
    private int activeFlag;

    @Basic
    @Column(name = "create_date", nullable = false)
    private Timestamp createDate;

    @Basic
    @Column(name = "update_date", nullable = false)
    private Timestamp updateDate;

    @OneToMany(mappedBy = "productInfoByProductId")
    private Set<History> historiesById = new HashSet<>();

    @OneToMany(mappedBy = "productInfoByProductId")
    private Set<Invoice> invoicesById = new HashSet<>();

    @OneToMany(mappedBy = "productInfoByProductId")
    private Set<ProductInStock> productInStocksById = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "cate_id", referencedColumnName = "id", nullable = false)
    private Category categoryByCateId;

}
