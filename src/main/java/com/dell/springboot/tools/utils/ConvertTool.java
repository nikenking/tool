package com.dell.springboot.tools.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertTool {
    /**
     * 转换成["",""]*/
    public static String convert1(String  s){
        s+="\r\n";
        StringBuilder result= new StringBuilder("[");
        Matcher m = Pattern.compile("(.*?)\r\n").matcher(s);
        while (m.find()) {
            if (m.group(1).length()!=0){
                result.append('"').append(m.group(1)).append("\",");
            }
        }
        result.deleteCharAt(result.length()-1);
        result.append("]");
        return result.toString();
    }
    /**
     * 转换成List list = Arrays.asList("");*/
    public static String convert2(String  s){
        s+="\r\n";
        StringBuilder result= new StringBuilder("List<String> list = Arrays.asList(");
        Matcher m = Pattern.compile("(.*?)\r\n").matcher(s);
        while (m.find()) {
            if (m.group(1).length()!=0){
                result.append('"').append(m.group(1)).append("\",\n");
            }
        }
        result.deleteCharAt(result.length()-2);
        result.append(");");
        return result.toString();
    }

}
