package com.dell.springboot.tools.utils;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BufferUtil {
    public static void write(String s, File file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
        writer.write(getFormat(s));
        writer.close();
        System.out.println("转化完毕:\n"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    public static String getFormat(String s){
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = format1.format(new Date());
        return "--------------------------------------------" + format + "--------------------------------------------\n" +
                s + "\n" +
                "--------------------------------------------" + format + "--------------------------------------------\n";
    }
}
