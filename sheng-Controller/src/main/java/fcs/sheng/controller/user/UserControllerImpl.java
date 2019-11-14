package fcs.sheng.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import fcs.sheng.entity.user.UserEntity;
import fcs.sheng.redis.RedisServiceTemp;
import fcs.sheng.req.user.LoginReq;
import fcs.sheng.rsq.Result;
import fcs.sheng.user.UserService;
import fcs.sheng.utils.KeyGenerator;
import fcs.sheng.utils.RedisPrefixUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @autor 叫盛哥哦
 * @date 2019/11/14 17:14
 * @description TODO
 */
@RestController
public class UserControllerImpl implements UserController {
    @Reference(version = "1.0.0")
    private UserService userService;


    /** HTTP Response中Session ID 的名字 */
    @Value("${session.SessionIdName}")
    private String sessionIdName;


    @Override
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {

        // 登录鉴权
        UserEntity userEntity = userService.login(loginReq);

        // 登录成功
        doLoginSuccess(userEntity, httpRsp);
        return Result.newSuccessResult(userEntity);
    }

    /**
     * 处理登录成功
     * @param userEntity 用户信息
     * @param httpRsp HTTP响应参数
     */
    private void doLoginSuccess(UserEntity userEntity, HttpServletResponse httpRsp) {
        // 生成SessionID
        String sessionID = RedisPrefixUtil.SessionID_Prefix + KeyGenerator.getKey();

        // 将 SessionID-UserEntity 存入Redis
        // TODO 暂时存储本地
//        redisService.set(sessionID, userEntity, sessionExpireTime);
        RedisServiceTemp.userMap.put(sessionID, userEntity);

        // 将SessionID存入HTTP响应头
        Cookie cookie = new Cookie(sessionIdName, sessionID);
        httpRsp.addCookie(cookie);
    }
}
