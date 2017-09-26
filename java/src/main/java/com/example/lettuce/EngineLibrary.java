package com.example.lettuce;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Name;
import org.bytedeco.javacpp.annotation.StdString;
import org.bytedeco.javacpp.annotation.Virtual;

public class EngineLibrary extends EngineConfigurer {

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
        @Virtual
        public native void call(CallbackInfo info);
    }

    @Name("CbInfo")
    public static class CallbackInfo extends Pointer {
        static { Loader.load(); }
        private native void allocate();
        public CallbackInfo() { allocate(); }
        //public native @StdString @ByRef String getMessage();
        public native @StdString String getMessage();
        ///public native @StdString @ByPtr String getUsername();
        public native @StdString String getUsername();
    }
}
