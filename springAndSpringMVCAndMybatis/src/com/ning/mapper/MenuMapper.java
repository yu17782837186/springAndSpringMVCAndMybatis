package com.ning.mapper;

import com.ning.pojo.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> selByPid(int pid);
}
