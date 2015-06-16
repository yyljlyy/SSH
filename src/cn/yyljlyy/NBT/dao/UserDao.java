package cn.yyljlyy.NBT.dao;

import cn.yyljlyy.NBT.bean.TLoginEntity;

/**
 * Created by lee on 2015/6/16.
 */
public interface UserDao {
    public TLoginEntity findById(Object id);
}
