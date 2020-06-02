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
@TableName("sys_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("user_name")
    private String userName;
    private String account;
    private String password;
    private String email;
    private String telephone;
    private String address;
    @TableField("cart_type")
    private String cartType;
    private String cartNo;
    private String nationality;
    private Date birth;
    private String sex;
    private String status;
    @TableField("error_count")
    private Integer errorCount;
    @TableField("login_ip")
    private String loginIp;
    @TableField("login_mac")
    private String loginMac;
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
    @TableField("account_type")
    private String accountType;
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

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public User setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public User setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCartType() {
        return cartType;
    }

    public User setCartType(String cartType) {
        this.cartType = cartType;
        return this;
    }

    public String getCartNo() {
        return cartNo;
    }

    public User setCartNo(String cartNo) {
        this.cartNo = cartNo;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public User setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public Date getBirth() {
        return birth;
    }

    public User setBirth(Date birth) {
        this.birth = birth;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public User setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public User setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getErrorCount() {
        return errorCount;
    }

    public User setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public User setLoginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

    public String getLoginMac() {
        return loginMac;
    }

    public User setLoginMac(String loginMac) {
        this.loginMac = loginMac;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public User setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getCreateId() {
        return createId;
    }

    public User setCreateId(Integer createId) {
        this.createId = createId;
        return this;
    }

    public String getCreateName() {
        return createName;
    }

    public User setCreateName(String createName) {
        this.createName = createName;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public User setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public User setUpdateId(Integer updateId) {
        this.updateId = updateId;
        return this;
    }

    public String getUpdateName() {
        return updateName;
    }

    public User setUpdateName(String updateName) {
        this.updateName = updateName;
        return this;
    }

    public String getAccountType() {
        return accountType;
    }

    public User setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public User setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getReserve() {
        return reserve;
    }

    public User setReserve(String reserve) {
        this.reserve = reserve;
        return this;
    }

    public String getReserve1() {
        return reserve1;
    }

    public User setReserve1(String reserve1) {
        this.reserve1 = reserve1;
        return this;
    }

    public String getReserve2() {
        return reserve2;
    }

    public User setReserve2(String reserve2) {
        this.reserve2 = reserve2;
        return this;
    }

    public String getReserve3() {
        return reserve3;
    }

    public User setReserve3(String reserve3) {
        this.reserve3 = reserve3;
        return this;
    }

    public Integer getReserve4() {
        return reserve4;
    }

    public User setReserve4(Integer reserve4) {
        this.reserve4 = reserve4;
        return this;
    }

    public Date getReserve5() {
        return reserve5;
    }

    public User setReserve5(Date reserve5) {
        this.reserve5 = reserve5;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", userName=" + userName +
        ", account=" + account +
        ", password=" + password +
        ", email=" + email +
        ", telephone=" + telephone +
        ", address=" + address +
        ", cartType=" + cartType +
        ", cartNo=" + cartNo +
        ", nationality=" + nationality +
        ", birth=" + birth +
        ", sex=" + sex +
        ", status=" + status +
        ", errorCount=" + errorCount +
        ", loginIp=" + loginIp +
        ", loginMac=" + loginMac +
        ", createTime=" + createTime +
        ", createId=" + createId +
        ", createName=" + createName +
        ", updateTime=" + updateTime +
        ", updateId=" + updateId +
        ", updateName=" + updateName +
        ", accountType=" + accountType +
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
