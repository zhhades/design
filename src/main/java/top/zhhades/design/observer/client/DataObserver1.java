package top.zhhades.design.observer.client;

import top.zhhades.event.Subscribe;

public class DataObserver1 {

    public DataObserver1(String name) {
        this.name = name;
    }

    public DataObserver1() {
    }

    private String name;

    @Subscribe
    public void func(String msg) {
        System.out.println(this.name+" receive String msg: " + msg);
    }
}

