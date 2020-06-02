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
@TableName("sys_dict")
public class Dict extends Model<Dict> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("dict_name")
    private String dictName;
    @TableField("dict_code")
    private String dictCode;
    @TableField("dict_type")
    private String dictType;
    @TableField("group_name")
    private String groupName;
    @TableField("group_code")
    private String groupCode;
    @TableField("parent_id")
    private Integer parentId;
    private String status;
    @TableField("dict_order")
    private String dictOrder;
    private String remark;
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
    private String reserve;
    private String reserve1;
    private String reserve2;
    private String reserve3;
    private Integer reserve4;
    private Date reserve5;


    public Integer getId() {
        return id;
    }

    public Dict setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getDictName() {
        return dictName;
    }

    public Dict setDictName(String dictName) {
        this.dictName = dictName;
        return this;
    }

    public String getDictCode() {
        return dictCode;
    }

    public Dict setDictCode(String dictCode) {
        this.dictCode = dictCode;
        return this;
    }

    public String getDictType() {
        return dictType;
    }

    public Dict setDictType(String dictType) {
        this.dictType = dictType;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public Dict setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public Dict setGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Dict setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Dict setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getDictOrder() {
        return dictOrder;
    }

    public Dict setDictOrder(String dictOrder) {
        this.dictOrder = dictOrder;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public Dict setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Dict setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getCreateId() {
        return createId;
    }

    public Dict setCreateId(Integer createId) {
        this.createId = createId;
        return this;
    }

    public String getCreateName() {
        return createName;
    }

    public Dict setCreateName(String createName) {
        this.createName = createName;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Dict setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public Dict setUpdateId(Integer updateId) {
        this.updateId = updateId;
        return this;
    }

    public String getUpdateName() {
        return updateName;
    }

    public Dict setUpdateName(String updateName) {
        this.updateName = updateName;
        return this;
    }

    public String getReserve() {
        return reserve;
    }

    public Dict setReserve(String reserve) {
        this.reserve = reserve;
        return this;
    }

    public String getReserve1() {
        return reserve1;
    }

    public Dict setReserve1(String reserve1) {
        this.reserve1 = reserve1;
        return this;
    }

    public String getReserve2() {
        return reserve2;
    }

    public Dict setReserve2(String reserve2) {
        this.reserve2 = reserve2;
        return this;
    }

    public String getReserve3() {
        return reserve3;
    }

    public Dict setReserve3(String reserve3) {
        this.reserve3 = reserve3;
        return this;
    }

    public Integer getReserve4() {
        return reserve4;
    }

    public Dict setReserve4(Integer reserve4) {
        this.reserve4 = reserve4;
        return this;
    }

    public Date getReserve5() {
        return reserve5;
    }

    public Dict setReserve5(Date reserve5) {
        this.reserve5 = reserve5;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Dict{" +
        "id=" + id +
        ", dictName=" + dictName +
        ", dictCode=" + dictCode +
        ", dictType=" + dictType +
        ", groupName=" + groupName +
        ", groupCode=" + groupCode +
        ", parentId=" + parentId +
        ", status=" + status +
        ", dictOrder=" + dictOrder +
        ", remark=" + remark +
        ", createTime=" + createTime +
        ", createId=" + createId +
        ", createName=" + createName +
        ", updateTime=" + updateTime +
        ", updateId=" + updateId +
        ", updateName=" + updateName +
        ", reserve=" + reserve +
        ", reserve1=" + reserve1 +
        ", reserve2=" + reserve2 +
        ", reserve3=" + reserve3 +
        ", reserve4=" + reserve4 +
        ", reserve5=" + reserve5 +
        "}";
    }
}
