package com.happy.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yanghui
 * @since 2020-06-02
 */
@TableName("sys_menu")
public class Menu extends Model<Menu> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("menu_name")
    private String menuName;
    @TableField("menu_type")
    private String menuType;
    @TableField("menu_level")
    private String menuLevel;
    @TableField("menu_url")
    private String menuUrl;
    @TableField("parent_id")
    private Integer parentId;
    @TableField("menu_icon")
    private String menuIcon;
    @TableField("menu_order")
    private String menuOrder;
    private String status;
    @TableField("create_time")
    private Date createTime;
    @TableField("create_id")
    private Integer createId;
    @TableField("create_name")
    private String createName;
    @TableField("update_time")
    private Date updateTime;
    @TableField("update_id")
    private Integer updateId;
    @TableField("update_name")
    private String updateName;
    private String remark;
    private String reserve;
    private String reserve1;
    private String reserve2;
    private String reserve3;
    private Integer reserve4;
    private Date reserve5;


    public Integer getId() {
        return id;
    }

    public Menu setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getMenuName() {
        return menuName;
    }

    public Menu setMenuName(String menuName) {
        this.menuName = menuName;
        return this;
    }

    public String getMenuType() {
        return menuType;
    }

    public Menu setMenuType(String menuType) {
        this.menuType = menuType;
        return this;
    }

    public String getMenuLevel() {
        return menuLevel;
    }

    public Menu setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
        return this;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public Menu setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
        return this;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Menu setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public Menu setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
        return this;
    }

    public String getMenuOrder() {
        return menuOrder;
    }

    public Menu setMenuOrder(String menuOrder) {
        this.menuOrder = menuOrder;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Menu setStatus(String status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Menu setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getCreateId() {
        return createId;
    }

    public Menu setCreateId(Integer createId) {
        this.createId = createId;
        return this;
    }

    public String getCreateName() {
        return createName;
    }

    public Menu setCreateName(String createName) {
        this.createName = createName;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Menu setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public Menu setUpdateId(Integer updateId) {
        this.updateId = updateId;
        return this;
    }

    public String getUpdateName() {
        return updateName;
    }

    public Menu setUpdateName(String updateName) {
        this.updateName = updateName;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public Menu setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getReserve() {
        return reserve;
    }

    public Menu setReserve(String reserve) {
        this.reserve = reserve;
        return this;
    }

    public String getReserve1() {
        return reserve1;
    }

    public Menu setReserve1(String reserve1) {
        this.reserve1 = reserve1;
        return this;
    }

    public String getReserve2() {
        return reserve2;
    }

    public Menu setReserve2(String reserve2) {
        this.reserve2 = reserve2;
        return this;
    }

    public String getReserve3() {
        return reserve3;
    }

    public Menu setReserve3(String reserve3) {
        this.reserve3 = reserve3;
        return this;
    }

    public Integer getReserve4() {
        return reserve4;
    }

    public Menu setReserve4(Integer reserve4) {
        this.reserve4 = reserve4;
        return this;
    }

    public Date getReserve5() {
        return reserve5;
    }

    public Menu setReserve5(Date reserve5) {
        this.reserve5 = reserve5;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Menu{" +
        "id=" + id +
        ", menuName=" + menuName +
        ", menuType=" + menuType +
        ", menuLevel=" + menuLevel +
        ", menuUrl=" + menuUrl +
        ", parentId=" + parentId +
        ", menuIcon=" + menuIcon +
        ", menuOrder=" + menuOrder +
        ", status=" + status +
        ", createTime=" + createTime +
        ", createId=" + createId +
        ", createName=" + createName +
        ", updateTime=" + updateTime +
        ", updateId=" + updateId +
        ", updateName=" + updateName +
        ", remark=" + remark +
        ", reserve=" + reserve +
        ", reserve1=" + reserve1 +
        ", reserve2=" + reserve2 +
        ", reserve3=" + reserve3 +
        ", reserve4=" + reserve4 +
        ", reserve5=" + reserve5 +
        "}";
    }
}
