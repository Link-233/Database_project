package yyx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yyx.dao.UserInfoMapper;
import yyx.entity.UserInfo;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public List<UserInfo> getAll() {
        return userInfoMapper.selectByExample(null);

    }
}
