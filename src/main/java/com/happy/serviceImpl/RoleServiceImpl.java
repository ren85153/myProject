package com.happy.serviceImpl;

import com.happy.entity.Role;
import com.happy.mapper.RoleMapper;
import com.happy.service.RoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
