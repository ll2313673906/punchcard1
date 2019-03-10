package com.soft1841;

import com.soft1841.entity.Rectangles;
import com.soft1841.entity.Round;
import com.soft1841.entity.Shape;

/**
 * 计算类
 * @author liulian
 * 2019.3.10
 */
public class Count {
    public static void main(String[] args) {
        Shape shape = new Round();
        shape.radius = 2;
        shape.area();
        shape = new Rectangles();
        shape.height = 6;
        shape.width = 8;
        shape.area();
    }
}
