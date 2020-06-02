package com.happy.serviceImpl;

import com.happy.entity.Logs;
import com.happy.mapper.LogsMapper;
import com.happy.service.LogsService;
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
public class LogsServiceImpl extends ServiceImpl<LogsMapper, Logs> implements LogsService {

}
