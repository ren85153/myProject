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
@TableName("sys_logs")
public class Logs extends Model<Logs> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("oper_type")
    private String operType;
    @TableField("oper_content")
    private String operContent;
    @TableField("create_time")
    private Date createTime;
    @TableField("create_id")
    private Integer createId;
    private String ip;
    private String reserve;
    private String reserve1;
    private String reserve2;
    private String reserve3;
    private Integer reserve4;
    private Date reserve5;


    public Integer getId() {
        return id;
    }

    public Logs setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getOperType() {
        return operType;
    }

    public Logs setOperType(String operType) {
        this.operType = operType;
        return this;
    }

    public String getOperContent() {
        return operContent;
    }

    public Logs setOperContent(String operContent) {
        this.operContent = operContent;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Logs setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getCreateId() {
        return createId;
    }

    public Logs setCreateId(Integer createId) {
        this.createId = createId;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public Logs setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getReserve() {
        return reserve;
    }

    public Logs setReserve(String reserve) {
        this.reserve = reserve;
        return this;
    }

    public String getReserve1() {
        return reserve1;
    }

    public Logs setReserve1(String reserve1) {
        this.reserve1 = reserve1;
        return this;
    }

    public String getReserve2() {
        return reserve2;
    }

    public Logs setReserve2(String reserve2) {
        this.reserve2 = reserve2;
        return this;
    }

    public String getReserve3() {
        return reserve3;
    }

    public Logs setReserve3(String reserve3) {
        this.reserve3 = reserve3;
        return this;
    }

    public Integer getReserve4() {
        return reserve4;
    }

    public Logs setReserve4(Integer reserve4) {
        this.reserve4 = reserve4;
        return this;
    }

    public Date getReserve5() {
        return reserve5;
    }

    public Logs setReserve5(Date reserve5) {
        this.reserve5 = reserve5;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Logs{" +
        "id=" + id +
        ", operType=" + operType +
        ", operContent=" + operContent +
        ", createTime=" + createTime +
        ", createId=" + createId +
        ", ip=" + ip +
        ", reserve=" + reserve +
        ", reserve1=" + reserve1 +
        ", reserve2=" + reserve2 +
        ", reserve3=" + reserve3 +
        ", reserve4=" + reserve4 +
        ", reserve5=" + reserve5 +
        "}";
    }
}
