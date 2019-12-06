package com.ning.service.impl;

import com.ning.mapper.MenuMapper;
import com.ning.pojo.Menu;
import com.ning.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;
    @Override
    public List<Menu> show() {
        return menuMapper.selByPid(0);
    }
}
