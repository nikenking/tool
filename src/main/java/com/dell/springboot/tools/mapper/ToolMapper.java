package com.dell.springboot.tools.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ToolMapper {
    @Insert("insert into msgs(msg) values(#{msg})")
    public void insertEmployee(String msg);
}
