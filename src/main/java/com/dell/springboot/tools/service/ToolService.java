package com.dell.springboot.tools.service;

import com.dell.springboot.tools.mapper.ToolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToolService {
    @Autowired
    ToolMapper tm;

    public void insertMsg(String s){
        tm.insertEmployee(s);
    }

}
