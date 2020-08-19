package top.zhhades.design.decorator.v1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author zhhades
 */
@Slf4j
public class ClientTest {

    public static void main(String[] args) {
        Pancake pancake = new Pancake();
        log.info("make by {} cost {}", pancake.makeBy(), pancake.cost());
        Pancake pancakeWithEgg = new PancakeWithEgg();
        log.info("make by {} cost {}", pancakeWithEgg.makeBy(), pancakeWithEgg.cost());
        Pancake pancakeWithHam = new PancakeWithHam();
        log.info("make by {} cost {}", pancakeWithHam.makeBy(), pancakeWithHam.cost());
    }
}
