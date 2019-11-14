package fcs.sheng.entity.user;

/**
 * @autor 叫盛哥哦
 * @date 2019/11/14 16:24
 * @description TODO
 */
public class MenuEntity {
    /** 主键 */
    private String id;

    /** 菜单名称 */
    private String menuName;

    /** 菜单对应页面的URL */
    private String url;

    /** 父菜单的ID */
    private String parentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "MenuEntity{" +
                "id='" + id + '\'' +
                ", menuName='" + menuName + '\'' +
                ", url='" + url + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
