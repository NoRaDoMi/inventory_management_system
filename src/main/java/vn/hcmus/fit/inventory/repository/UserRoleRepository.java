package vn.hcmus.fit.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.hcmus.fit.inventory.entity.UserRole;

/**
 * Created by Asus on 11/9/2019.
 */
public interface UserRoleRepository extends JpaRepository<UserRole,Integer> {
}
