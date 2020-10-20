package com.dell.springboot.tools.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertTool {
    public static String convert1(String  s){
        s+="\r\n";
        StringBuilder result= new StringBuilder("[");
//        result.append(s.replaceAll("(.*)\r\n","\"$1\","));
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
}
