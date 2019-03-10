package com.soft1841;

import com.soft1841.entity.Elf;
import com.soft1841.entity.Elf2;
import com.soft1841.entity.Elf3;

/**
 * 定义主类
 * @author liulian
 * 2019.3.10
 */

public class JingLing {
    public static void main(String[] args) {
        Elf elf = new Elf2();
        elf.move = "可移动" ;
        elf.sing = "可唱歌";
        elf.elf();
     elf = new Elf3();
        elf.move = "可飞翔" ;
        elf.sing = "可跳舞";
        elf.elf();
    }
}
