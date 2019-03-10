package com.soft1841.entity;

import com.soft1841.dao.DrawImage;

public class Square implements DrawImage {
    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
