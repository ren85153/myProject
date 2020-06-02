package com.happy.service;

import com.happy.entity.User;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yanghui
 * @since 2020-06-02
 */
public interface UserService extends IService<User> {

	List<User> selectList(User user);

}
