package ycy.yyy.ap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ycy.yyy.ap.dao.UserMapper;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public List<Map> search() {
        return userMapper.search();
    }
}
