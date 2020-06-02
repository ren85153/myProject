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
@TableName("sys_role")
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("role_name")
    private String roleName;
    @TableField("role_type")
    private String roleType;
    @TableField("role_code")
    private String roleCode;
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

    public Role setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getRoleName() {
        return roleName;
    }

    public Role setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public String getRoleType() {
        return roleType;
    }

    public Role setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public Role setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Role setStatus(String status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Role setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getCreateId() {
        return createId;
    }

    public Role setCreateId(Integer createId) {
        this.createId = createId;
        return this;
    }

    public String getCreateName() {
        return createName;
    }

    public Role setCreateName(String createName) {
        this.createName = createName;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Role setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public Role setUpdateId(Integer updateId) {
        this.updateId = updateId;
        return this;
    }

    public String getUpdateName() {
        return updateName;
    }

    public Role setUpdateName(String updateName) {
        this.updateName = updateName;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public Role setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getReserve() {
        return reserve;
    }

    public Role setReserve(String reserve) {
        this.reserve = reserve;
        return this;
    }

    public String getReserve1() {
        return reserve1;
    }

    public Role setReserve1(String reserve1) {
        this.reserve1 = reserve1;
        return this;
    }

    public String getReserve2() {
        return reserve2;
    }

    public Role setReserve2(String reserve2) {
        this.reserve2 = reserve2;
        return this;
    }

    public String getReserve3() {
        return reserve3;
    }

    public Role setReserve3(String reserve3) {
        this.reserve3 = reserve3;
        return this;
    }

    public Integer getReserve4() {
        return reserve4;
    }

    public Role setReserve4(Integer reserve4) {
        this.reserve4 = reserve4;
        return this;
    }

    public Date getReserve5() {
        return reserve5;
    }

    public Role setReserve5(Date reserve5) {
        this.reserve5 = reserve5;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Role{" +
        "id=" + id +
        ", roleName=" + roleName +
        ", roleType=" + roleType +
        ", roleCode=" + roleCode +
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
