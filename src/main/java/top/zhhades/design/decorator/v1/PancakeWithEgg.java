package top.zhhades.design.decorator.v1;

import lombok.ToString;

/**
 * @author zhhades
 */
public class PancakeWithEgg extends Pancake {

    @Override
    public String makeBy() {
        return super.makeBy() + " 加1个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
