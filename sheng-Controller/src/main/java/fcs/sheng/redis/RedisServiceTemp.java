package fcs.sheng.redis;

import com.google.common.collect.Maps;
import fcs.sheng.entity.user.AccessAuthEntity;
import fcs.sheng.entity.user.UserEntity;

import java.util.Map;

/**
 * @autor 叫盛哥哦
 * @date 2019/11/14 17:22
 * @description TODO
 */
public class RedisServiceTemp {
    public static Map<String, AccessAuthEntity> accessAuthMap = Maps.newHashMap();

    public static Map<String, UserEntity> userMap = Maps.newHashMap();
}
