package com.example.lettuce;

import static com.example.lettuce.EngineLibrary.*;

public class CallbackImpl extends Callback {

    @Override
    public void call(CallbackInfo info) {
        msg = info.getMessage();
        usr = info.getUsername();
        System.out.println(info.getMessage());
        System.out.println(info.getUsername());
    }

    public String msg;
    public String usr;
}
