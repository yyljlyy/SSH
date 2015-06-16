package cn.yyljlyy.NBT.service.impl;

import cn.yyljlyy.NBT.bean.TLoginEntity;
import cn.yyljlyy.NBT.dao.UserDao;
import cn.yyljlyy.NBT.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lee on 2015/6/16.
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;

    @Override
    public TLoginEntity findById(Object id) {
        return userDao.findById(id);
    }
}
