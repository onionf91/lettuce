package com.example.lettuce;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.*;

public class EngineLibrary extends EngineProperties {
    static { Loader.load(); }

    public static final int
            OK = 1,
            NOT_OK = 0;

    public static final int
            API_OK = 0,
            API_OS_ERRO = 1;

    public static native @MemberGetter @Const @ByVal tsNCharcb JAVA();
    public static native @MemberGetter @Const @ByVal tsNCharcb CPP();

    public static class tsNCharcb extends Pointer {
        public native @Cast("char*") BytePointer pData();
        public native void pData(BytePointer pData);
        public native int iDataLen();
        public native void iDataLen(int iDataLen);
    }

    public static class Engine extends Pointer {
        static { Loader.load(); }
        private native void allocate(Callback cb);
        public Engine(Callback cb) { allocate(cb); }
        public native void run();
    }

    public static class Callback extends Pointer {
        static { Loader.load(); }
        private native void allocate();
        public Callback() { allocate(); }
        @Virtual public native int call(CallbackInfo info, IntPointer aiCode);
    }

    @Name("CbInfo")
    public static class CallbackInfo extends Pointer {
        static { Loader.load(); }
        private native void allocate();
        public CallbackInfo() { allocate(); }
        public native @MemberGetter @ByVal tsNCharcb sMessage_();
        //public native void sMessage_(tsNCharcb sMessage_);
        public native @ByRef String getMessage();
        public native @ByPtr String getUsername();
        //public native @StdString String getMessage();
        //public native @StdString String getUsername();
    }
}
