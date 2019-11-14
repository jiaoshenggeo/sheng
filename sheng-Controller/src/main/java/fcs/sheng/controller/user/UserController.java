package fcs.sheng.controller.user;

import fcs.sheng.req.user.LoginReq;
import fcs.sheng.rsq.Result;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @autor 叫盛哥哦
 * @date 2019/11/14 17:11
 * @description TODO
 */
public interface UserController {
    /**
     * 登录
     * @param loginReq 登录请求参数
     * @param httpRsp HTTP响应
     * @return 登录是否成功
     */
    @GetMapping("/login")
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp);
}
