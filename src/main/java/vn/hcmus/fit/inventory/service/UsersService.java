package vn.hcmus.fit.inventory.service;

import vn.hcmus.fit.inventory.entity.Users;

import java.util.List;

/**
 * Created by Asus on 11/10/2019.
 */
public interface UsersService {
    List<Users> findByProperty(String property,Object o);
}
