package com.dell.springboot.tools.controller;

import com.dell.springboot.tools.service.ToolService;
import com.dell.springboot.tools.utils.BufferUtil;
import com.dell.springboot.tools.utils.ConvertTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

@Controller
public class ToolController{
    @Autowired
    ToolService ts;
    @GetMapping(value = {"/"})
    public String index(){
        return "toolIndex";
    }

    @PostMapping(value = {"/save"})
    public String inserMsg(@RequestParam("msg") String msg, Model model) throws IOException {
        msg = ConvertTool.convert1(msg);
        BufferUtil.write(msg,new File("C:\\Tool\\ToolStore.txt"));
        model.addAttribute("result",msg);
        return "toolIndex";
    }

    @PostMapping(value = {"/toArrays"})
    public String inserMsgInArrays(@RequestParam("msg") String msg, Model model) throws IOException {
        msg = ConvertTool.convert2(msg);
        BufferUtil.write(msg,new File("C:\\Tool\\ToolStore.txt"));
        model.addAttribute("result",msg);
        return "toolIndex";
    }


}
