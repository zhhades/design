package top.zhhades.design.decorator.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhhades
 */
@Slf4j
public class ClientTest {

    public static void main(String[] args) {
        AbstractPancake pancake = new Pancake();
        pancake = new EggDecorator(pancake);
        pancake = new HamDecorator(pancake);
        log.info("make by {} cost {}", pancake.makeBy(), pancake.cost());
    }
}
