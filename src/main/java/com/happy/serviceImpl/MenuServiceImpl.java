package com.happy.serviceImpl;

import com.happy.entity.Menu;
import com.happy.mapper.MenuMapper;
import com.happy.service.MenuService;
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
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
