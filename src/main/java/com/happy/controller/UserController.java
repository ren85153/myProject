package com.happy.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.happy.base.BaseResult;
import com.happy.entity.User;
import com.happy.service.UserService;
import com.happy.utils.BaseResultUtil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yanghui
 * @since 2020-06-02
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired UserService userService;
	
	@ResponseBody
	@RequestMapping("/all")
	public BaseResult all() {
//	public BaseResult all(@RequestBody User user) {
		List<User> list = userService.selectList(new User());
		return BaseResultUtil.success(list);
	}
	

}

