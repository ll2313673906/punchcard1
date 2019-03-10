package com.soft1841;
/**
 * 绘制特殊的平行四边形
 * @author liulian
 * 2019.3.10
 */

import com.soft1841.dao.DrawImage;
import com.soft1841.entity.Diamond;
import com.soft1841.entity.Rectangle;
import com.soft1841.entity.Square;

public class SpecialParallelogram {
    public static void main(String[] args) {
        //接口也可以进行向上转型操作
        DrawImage[] images = {new Rectangle(), new Square(), new Diamond()};
        //遍历"画图形"接口类型的数组
        for (int i = 0; i < images.length; i++) {
            images[i].draw();

        }
    }
}
