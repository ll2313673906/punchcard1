package com.soft1841;

import com.soft1841.entity.Market;
import com.soft1841.entity.TaobaoMarket;
import com.soft1841.entity.WallMarket;

/**
 * 模拟“去商场买衣服”的场景
 * @author liulian
 * 2019.3.10
 */

public class GoShopping {
    public static void main(String[] args) {
        Market market = new WallMarket();
        market.name = "沃尔玛";
        market.goods = "七匹狼西服";
        market.shop();
        market = new TaobaoMarket();
        market.name = "淘宝";
        market.goods = "韩都衣舍花群";
        market.shop();


    }
}
