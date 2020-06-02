package com.happy.serviceImpl;

import com.happy.entity.User;
import com.happy.mapper.UserMapper;
import com.happy.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yanghui
 * @since 2020-06-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

	@Override
	public List<User> selectList(User user) {
		List<User> list = baseMapper.selectList(null);
		return list;
	}

}
