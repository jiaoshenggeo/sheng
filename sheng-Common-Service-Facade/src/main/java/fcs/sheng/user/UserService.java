package fcs.sheng.user;

import fcs.sheng.entity.user.UserEntity;
import fcs.sheng.req.user.LoginReq;

public interface UserService {
    public UserEntity login(LoginReq loginReq);
}
