package top.zhhades.design.decorator.v1;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhhades
 */
@Slf4j
public class Pancake {

    public String makeBy() {
        return "面粉";
    }

    public int cost() {
        return 5;
    }
}
