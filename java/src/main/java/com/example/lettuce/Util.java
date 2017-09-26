package com.example.lettuce;

import com.example.lettuce.EngineLibrary.Callback;
import com.example.lettuce.EngineLibrary.Engine;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.annotation.Platform;

@Platform(include = "util.hpp", link = "engine")
public class Util {
    static { Loader.load(); }
    public static native void cleanup(Engine engine);
    public static native void cleanup(Callback cb);
}
