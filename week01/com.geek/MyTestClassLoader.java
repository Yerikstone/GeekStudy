/**
 * Copyright (c) 2016-2021 All Rights Reserved.
 */
package com.geek;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description: ${DESCRIPTION}
 * <p></p>
 * @author: Yerik.Stone
 * @create: at 2021-05-05 13:06
 * @version: 1.0.0
 * @history: modify history
 * <author>              <time>              <version>              <desc>
 */
public class MyTestClassLoader extends ClassLoader {

    public static void main(String[] args) {
        try {
            Class<?> hello = new MyTestClassLoader().findClass("Hello");
            Object instance = hello.newInstance();
            Method method = instance.getClass().getMethod("hello");
            method.invoke(instance);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }



    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //读取xlass文件成byte数组
        byte[] bytes = getByteContext("F:\\Hello.xlass");
        //解密byte数组
        byte[]  bytesDecodes = decode(bytes);
        return defineClass(name,bytesDecodes,0,bytesDecodes.length);
    }

    private byte[] getByteContext(String filePath) {
        File file = new File(filePath);
        long length  = file.length();
        if(length > Integer.MAX_VALUE){
            System.out.println("内容太多了");
            return null;
        }
        byte[]  buffer = new byte[(int)length];
        try {
            FileInputStream fileInputStream  = new FileInputStream(file);

            int offset = 0;
            int  readNum;
            while(offset < buffer.length &&
                    (readNum = fileInputStream.read(buffer,offset,buffer.length-offset))>0){
              offset +=readNum;
            }

            if(offset != buffer.length){
                throw new IOException("未完全读取xlass文件");
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return buffer;
    }

    public byte[] decode(byte[] bytes){
       byte[] byteDecodes = new byte[bytes.length];
       for(int i=0;i< byteDecodes.length;i++){
           byteDecodes[i] = (byte)(255 - bytes[i]);
       }
        return byteDecodes;
    }
}
