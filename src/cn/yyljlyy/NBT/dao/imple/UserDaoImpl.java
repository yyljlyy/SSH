package cn.yyljlyy.NBT.dao.imple;

import cn.yyljlyy.NBT.bean.TLoginEntity;
import cn.yyljlyy.NBT.dao.UserDao;
import org.hibernate.Session;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 * Created by lee on 2015/6/16.
 */
@Repository
public class UserDaoImpl extends SuperDao implements UserDao {
    static Logger logger = Logger.getLogger(UserDaoImpl.class.toString());
    @Override
    public TLoginEntity findById(Object id) {
        TLoginEntity tLoginEntity = null;
        try {
            Session session=sessionFactory.openSession();
            tLoginEntity = (TLoginEntity) session.load(TLoginEntity.class, (Serializable) id);
            logger.info("id:" + id);
        } catch (DataAccessException e) {
            logger.info(e.toString());
        }
        return tLoginEntity;
    }
}
