package vn.hcmus.fit.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.hcmus.fit.inventory.entity.Users;
import vn.hcmus.fit.inventory.repository.UsersRepository;

import java.util.List;

/**
 * Created by Asus on 11/10/2019.
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> findByProperty(String property, Object o) {
        return null;
    }
}
