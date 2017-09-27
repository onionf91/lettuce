package com.example.lettuce;

import org.apache.log4j.Logger;
import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.annotation.ByPtr;

import static com.example.lettuce.EngineLibrary.*;

public class CallbackImpl extends Callback {

    static Logger log = Logger.getLogger(Configuration.class.getName());

    @Override
    public int call(CallbackInfo info, @ByPtr IntPointer aiCode) {
        log.info("~~~~`");
        msg = info.getMessage();
        log.info("~~~~`");
        usr = info.getUsername();
        log.info("~~~~`");
        String sMsg = info.sMessage_().pData().getString();
        log.info("~~~~`");
        byte[] data = info.sMessage_().pData().getStringBytes();
        log.info("~~~~`");
        System.out.println(msg);
        System.out.println(usr);
        System.out.println(sMsg);
        System.out.println(data);
        if (sMsg.equals(JAVA().pData().getString())) {
            aiCode.put(API_OK);
            return OK;
        }
        else {
            aiCode.put(API_OS_ERRO);
            return NOT_OK;
        }
    }

    public String msg;
    public String usr;
}
