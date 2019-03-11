package com.soft1841;

import java.util.Scanner;

/**
 * 捕捉控制台输入商品单价后的异常
 * @author liulian
 * 2019.3.11
 */

public class Tomato {
    public static void main(String[] args) {
        //创建控制台输入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("今天的西红柿单价(单价格式为“3.00”):");//控制台输出提示信息
        String dayPrice = sc.next();//把控制台输入的西红柿单价赋值给变量dayPrice
        if (dayPrice.length() == 4) {//控制台输入的字符串长度为4时

            try {                         //把可能产生的异常的Java代码放在try中
                String message = "西红柿" + dayPrice + "元/500克";//西红柿的售价信息
                String[] strArr = message.split("：");//使用：拆分字符串
                String unitPriceStr = strArr[2].substring(0,4);//截取西红柿单价：2.99
                double weight = 650;   //顾客购买西红柿的重量
                double unitPriceDou = Double.parseDouble(unitPriceStr);//将String类型的西红柿单价转换成double类型
                System.out.println(message + ",顾客买了" + weight + "克的西红柿，需支付"
                        +(float ) ((weight / 500) * unitPriceDou) + "元");//输出顾客购买650克的西红柿需要支付的金额
            }catch (ArrayIndexOutOfBoundsException aiobe){//捕捉数组元素下标越界异常对象
                aiobe.printStackTrace();
            }catch (Exception e){//不捉与已产生的异常类型相匹配的异常对象
                e.printStackTrace();
            }finally {
                sc.close();//关闭控制台输入对象
                System.out.println("控制台输入对象被关闭");//输出提示信息
            }
        }else {    //控制台输入的字符串长度不为4时
            System.out.println("违规操作：" + "输入西红柿单价时小数点后必须保留两位有效数字（如3.00）！");//输出提示信息
        }

    }
}
