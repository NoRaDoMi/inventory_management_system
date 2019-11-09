package vn.hcmus.fit.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.hcmus.fit.inventory.entity.ProductInStock;

/**
 * Created by Asus on 11/9/2019.
 */
public interface ProductInStockRepository extends JpaRepository<ProductInStock,Integer> {
}
