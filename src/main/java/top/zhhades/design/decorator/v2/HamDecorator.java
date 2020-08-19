package top.zhhades.design.decorator.v2;

import org.springframework.util.Assert;

/**
 * @author zhhades
 */
public class HamDecorator extends AbstractPancakeDecorator {

    public HamDecorator(AbstractPancake pancake) {
        super(pancake);
    }

    @Override
    protected String makeBy() {
        return super.makeBy() + " 加1个火腿肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
