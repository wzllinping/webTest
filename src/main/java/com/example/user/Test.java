package com.example.user;

public class Test {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("wang");
        UserInfo userInfo1 = userInfo;
        try {
            userInfo.setName("zhang");
            System.out.println(userInfo.getName());
            System.out.println(userInfo1.getName());
            System.out.println("成功");
            System.out.println("完成了");
            System.out.println("测试了");
            System.out.println("123");
            System.out.println("测试一下");
            System.out.println("测试一下试试");
        } catch (Exception exception) {

        }

    }
}
