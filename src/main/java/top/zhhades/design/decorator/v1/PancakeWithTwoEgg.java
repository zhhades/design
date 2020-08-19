package top.zhhades.design.decorator.v1;

/**
 * @author zhhades
 */
public class PancakeWithTwoEgg extends PancakeWithEgg {

    @Override
    public String makeBy() {
        return super.makeBy() + " 再加1个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
