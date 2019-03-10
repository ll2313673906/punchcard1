package com.soft1841.entity;

/**
 * 圆形的实体类
 * @author liulian
 * 2019.3.10
 */

public class Round extends Shape{
    public void area(){
      round =   radius * radius * 3.14;
        System.out.println("圆形的面积是：" + round);

    }

}
