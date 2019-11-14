package fcs.sheng.entity.user;

/**
 * @autor 叫盛哥哦
 * @date 2019/11/14 16:24
 * @description TODO
 */
public class PermissionEntity {
    /** 主键 */
    private String id;

    /** 权限名称 */
    private String permission;

    /** 权限描述 */
    private String desc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "PermissionEntity{" +
                "id='" + id + '\'' +
                ", permission='" + permission + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
