package fcs.sheng.exception;

import java.io.Serializable;

/**
 * @autor 叫盛哥哦
 * @date 2019/11/14 16:42
 * @description TODO
 */
public class CommonBizException extends RuntimeException implements Serializable {
    private ExpCodeEnum codeEnum;

    public CommonBizException(ExpCodeEnum codeEnum){
        super(codeEnum.getMessage());
        this.codeEnum = codeEnum;
    }

    public CommonBizException(){}

    public ExpCodeEnum getCodeEnum() {
        return codeEnum;
    }
}
