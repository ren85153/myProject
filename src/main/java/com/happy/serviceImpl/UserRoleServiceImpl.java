package com.happy.serviceImpl;

import com.happy.entity.UserRole;
import com.happy.mapper.UserRoleMapper;
import com.happy.service.UserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
