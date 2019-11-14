package fcs.sheng.user.dao;

import fcs.sheng.entity.user.UserEntity;
import fcs.sheng.req.user.UserQueryReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @autor 叫盛哥哦
 * @date 2019/11/14 16:58
 * @description 用户相关DAO
 */
@Mapper
public interface UserDAO {
    /**
     * 查询用户信息
     * @param userQueryReq 查询请求
     * @return 查询结果
     */
    List<UserEntity> findUsers(@Param("userQueryReq") UserQueryReq userQueryReq);

}
