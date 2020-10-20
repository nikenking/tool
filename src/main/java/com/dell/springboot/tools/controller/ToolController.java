package com.dell.springboot.tools.controller;

import com.dell.springboot.tools.service.ToolService;
import com.dell.springboot.tools.utils.ConvertTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ToolController {
    @Autowired
    ToolService ts;
    @GetMapping(value = {"/"})
    public String index(){
        return "toolIndex";
    }

    @PostMapping(value = {"/save"})
    public String inserMsg(@RequestParam("msg") String msg, Model model){
        System.out.println("传递过来的信息:\n"+msg);
        msg = ConvertTool.convert1(msg);
        System.out.println("转化完毕:\n"+msg);
        model.addAttribute("result",msg);
        return "toolIndex";
    }
}
