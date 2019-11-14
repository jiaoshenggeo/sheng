package fcs.sheng.utils;

import java.util.UUID;

/**
 * @autor 叫盛哥哦
 * @date 2019/11/14 17:19
 * @description 主键生成器
 */
public class KeyGenerator {

    /**
     * 获得一个UUID
     * @return String UUID
     */
    public static String getKey(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }
}
