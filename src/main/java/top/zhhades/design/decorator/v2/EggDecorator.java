package top.zhhades.design.decorator.v2;

/**
 * @author zhhades
 */
public class EggDecorator extends AbstractPancakeDecorator {

    public EggDecorator(AbstractPancake pancake) {
        super(pancake);
    }

    @Override
    protected String makeBy() {
        return super.makeBy() + " 加1个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
