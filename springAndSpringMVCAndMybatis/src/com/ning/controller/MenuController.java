package com.ning.controller;

import com.ning.pojo.Menu;
import com.ning.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MenuController {
    //springmvc容器调用spring容器中内容
    @Resource
    private MenuService menuServiceImpl;
    @RequestMapping("show")
    @ResponseBody
    public List<Menu> show(){
        //把类型转换为json字符串并以流的形式输出
        return menuServiceImpl.show();
    }
}
