package cn.yyljlyy.NBT.service;

import cn.yyljlyy.NBT.bean.TLoginEntity;

/**
 * Created by lee on 2015/6/16.
 */
public interface UserService {
    public TLoginEntity findById(Object id);
}
