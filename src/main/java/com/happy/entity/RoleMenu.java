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
@TableName("sys_role_menu")
public class RoleMenu extends Model<RoleMenu> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("role_id")
    private Integer roleId;
    @TableField("menu_id")
    private Integer menuId;
    private String status;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_name")
    private Date updateName;


    public Integer getId() {
        return id;
    }

    public RoleMenu setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public RoleMenu setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public RoleMenu setMenuId(Integer menuId) {
        this.menuId = menuId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public RoleMenu setStatus(String status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public RoleMenu setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateName() {
        return updateName;
    }

    public RoleMenu setUpdateName(Date updateName) {
        this.updateName = updateName;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "RoleMenu{" +
        "id=" + id +
        ", roleId=" + roleId +
        ", menuId=" + menuId +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateName=" + updateName +
        "}";
    }
}
