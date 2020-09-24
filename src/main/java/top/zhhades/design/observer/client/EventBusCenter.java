package top.zhhades.design.observer.client;

import top.zhhades.event.EventBus;

public class EventBusCenter {

    private static EventBus eventBus = new EventBus();

    private EventBusCenter() {

    }

    public static EventBus getInstance() {

        return eventBus;

    }

    public static void register(Object obj) {

        eventBus.register(obj);

    }

    public static void post(Object obj) {

        eventBus.post(obj);

    }

}

