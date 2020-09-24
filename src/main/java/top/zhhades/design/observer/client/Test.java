package top.zhhades.design.observer.client;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        DataObserver1 observer1 = new DataObserver1("observer1");
        DataObserver1 observer2 = new DataObserver1("observer2");
        DataObserver2 observer21 = new DataObserver2("observer21");
        DataObserver3 observer31 = new DataObserver3("observer31");

        EventBusCenter.register(observer1);
        EventBusCenter.register(observer2);
        EventBusCenter.register(observer21);
        EventBusCenter.register(observer31);

        System.out.println("============  start  ====================");

        EventBusCenter.post("post string method");

        EventBusCenter.post(123);

        System.out.println("============    end          =============");

    }

}

