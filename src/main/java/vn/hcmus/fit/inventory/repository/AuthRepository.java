package vn.hcmus.fit.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.hcmus.fit.inventory.entity.Auth;

/**
 * Created by Asus on 11/9/2019.
 */
public interface AuthRepository extends JpaRepository<Auth,Integer> {
}
