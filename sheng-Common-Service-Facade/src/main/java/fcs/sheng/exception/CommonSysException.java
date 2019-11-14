package fcs.sheng.exception;

import java.io.Serializable;

/**
 * @autor 叫盛哥哦
 * @date 2019/11/14 16:45
 * @description 通用系统异常
 */
public class CommonSysException extends  RuntimeException implements Serializable {
    private ExpCodeEnum codeEnum;

    public CommonSysException(ExpCodeEnum codeEnum) {
        super(codeEnum.getMessage());
        this.codeEnum = codeEnum;
    }

    public CommonSysException() {

    }
}
