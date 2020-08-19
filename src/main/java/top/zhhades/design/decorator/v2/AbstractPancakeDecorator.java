package top.zhhades.design.decorator.v2;

/**
 * @author zhhades
 */
public abstract class AbstractPancakeDecorator extends AbstractPancake {

    private AbstractPancake pancake;

    public AbstractPancakeDecorator(AbstractPancake pancake) {
        this.pancake = pancake;
    }

    @Override
    protected String makeBy() {
        return this.pancake.makeBy();
    }

    @Override
    protected int cost() {
        return this.pancake.cost();
    }
}
