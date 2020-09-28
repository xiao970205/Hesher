package com.Hesher.pojo;

import java.io.Serializable;

public class LeftMenu implements Serializable {
    private String id;

    private String menuName;

    private String fatherMenuId;

    private Integer menuLevel;

    private Integer menuOrder;

    private String menuType;

    private String menuJumpInfo;

    private static final long serialVersionUID = 1L;

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

    public String getFatherMenuId() {
        return fatherMenuId;
    }

    public void setFatherMenuId(String fatherMenuId) {
        this.fatherMenuId = fatherMenuId;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuJumpInfo() {
        return menuJumpInfo;
    }

    public void setMenuJumpInfo(String menuJumpInfo) {
        this.menuJumpInfo = menuJumpInfo;
    }
}