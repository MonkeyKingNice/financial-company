/*
 * Copyright(c) *** Technologies CO., Ltd 2020-2020. All rights reserved.
 */

package com.zengzhou.financial.home.utils;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 描述:[文件加密工具]
 *
 * @author [DELL]
 * @version v1.0
 * @since 2020-05-12
 * 包:[com.zengzhou.financial.home.utils]
 * 文件名:[EncryptionTool]
 * 创建时间:[2020-05-12 16:28]
 * 修改人:[DELL]
 * 修改时间:[2020-05-12 16:28]
 * 修改备注:[说明本次修改内容]
 * A版权所有 (A) ***技术有限公司 2020-2020
 */
public class EncryptionTool {
    private static final int KEY = 12;

    /**
     * @param filePath 文件路径
     * @throws
     * @功能描述: 加密文件
     * @author DELL
     * @date 2020-05-12 16:30
     */
    public static String encryption(String filePath) {
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            File file = new File(filePath);
            file.getParent();
            String encryptionFile = file.getParent() + File.separator + "encryption_" + file.getName();
            is = new FileInputStream(file);
            os = new FileOutputStream(encryptionFile);
            int read;
            while ((read = is.read()) != -1) {
                read = read ^ KEY;
                os.write(read);
            }
            return encryptionFile;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /**
     * @param filePath 文件路径
     * @throws
     * @功能描述: 解密密文件
     * @author DELL
     * @date 2020-05-12 16:30
     */
    public static String decrypt(String filePath) {
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            File file = new File(filePath);
            file.getParent();
            String decryptFile = file.getParent() + File.separator + "decrypt_" + file.getName();
            is = new FileInputStream(file);
            os = new FileOutputStream(decryptFile);
            int read;
            while ((read = is.read()) != -1) {
                read = read ^ KEY;
                os.write(read);
            }
            return decryptFile;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        int a = 66663;
//        int b = a ^ 10;
//        int c = b ^ 10;
//        System.out.println(b);
//        System.out.println(c);
//
//        String filePath = "E:\\github\\个人文档\\zzl-common\\Idea安装配置.docx";
//        // 加密
//        String encryption = encryption(filePath);
//        // 解密
//        String decrypt = decrypt(encryption);
//        System.out.println(decrypt);

        Class<?> ko = Class.forName("com.zengzhou.financial.home.utils.ZzlTest");
        Method[] methods = ko.getMethods();
        Method[] declaredMethods = ko.getDeclaredMethods();
        Field[] declaredFields = ko.getDeclaredFields();
        Field[] fields = ko.getFields();
        System.out.println(declaredFields[0].getName());
    }
}
