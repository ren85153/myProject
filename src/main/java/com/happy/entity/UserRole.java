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
@TableName("sys_user_role")
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("user_id")
    private Integer userId;
    @TableField("role_id")
    private Integer roleId;
    private String status;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_name")
    private Date updateName;


    public Integer getId() {
        return id;
    }

    public UserRole setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public UserRole setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public UserRole setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserRole setStatus(String status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserRole setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateName() {
        return updateName;
    }

    public UserRole setUpdateName(Date updateName) {
        this.updateName = updateName;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserRole{" +
        "id=" + id +
        ", userId=" + userId +
        ", roleId=" + roleId +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateName=" + updateName +
        "}";
    }
}
