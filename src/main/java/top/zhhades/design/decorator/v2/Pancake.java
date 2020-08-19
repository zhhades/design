package top.zhhades.design.decorator.v2;

/**
 * @author zhhades
 */
public class Pancake extends AbstractPancake {

    @Override
    protected String makeBy() {
        return "面粉";
    }

    @Override
    protected int cost() {
        return 5;
    }
}
