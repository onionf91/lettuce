package com.example.lettuce;

import javax.annotation.PostConstruct;

import static com.example.lettuce.EngineLibrary.*;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @PostConstruct
    void postConstruct() {
        Callback cb = new CallbackImpl();
        Engine engine = new Engine(cb);
        engine.run();
        Util.cleanup(engine);
        Util.cleanup(cb);
    }
}
