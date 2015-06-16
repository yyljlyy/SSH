package cn.yyljlyy.NBT.dao.imple;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by lee on 2015/6/16.
 */
@Component
public class SuperDao {
    @Resource
    SessionFactory sessionFactory;
}
