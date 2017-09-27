package com.example.lettuce;

import org.apache.log4j.Logger;
import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.annotation.ByPtr;

import static com.example.lettuce.EngineLibrary.*;

public class CallbackImpl extends Callback {

    static Logger log = Logger.getLogger(Configuration.class.getName());

    @Override
    public int call(CallbackInfo info, @ByPtr IntPointer aiCode) {
        msg = info.getMessage();
        usr = info.getUsername();
        System.out.println(info.getMessage());
        System.out.println(info.getUsername());
        log.info("~~~~`");
        String sMsg = new String(info.sMessage_().pData().getStringBytes());
        log.info("~~~~`");
        System.out.println(sMsg);
        if (sMsg.equals(java)) {
            aiCode.put(API_OK);
            return OK;
        }
        else {
            aiCode.put(API_OS_ERRO);
            return NOT_OK;
        }
    }

    String java = new String(JAVA().pData().getStringBytes());
    String cpp = new String(CPP().pData().getStringBytes());

    public String msg;
    public String usr;
}
