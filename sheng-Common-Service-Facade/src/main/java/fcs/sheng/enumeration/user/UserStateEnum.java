package fcs.sheng.enumeration.user;

import fcs.sheng.enumeration.BaseEnum;

/**
 * @autor 叫盛哥哦
 * @date 2019/11/14 16:28
 * @description TODO
 */
public enum UserStateEnum implements BaseEnum {
    ON(1, "启用"),
    OFF(0, "禁用");

    private int code;
    private String msg;

    UserStateEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "UserStateEnum{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
