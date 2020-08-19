package top.zhhades.design.decorator.v1;

/**
 * @author zhhades
 */
public class PancakeWithHam extends PancakeWithEgg {

    @Override
    public String makeBy() {
        return super.makeBy() + " 加1个火腿肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
