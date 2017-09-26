package com.example.lettuce;

import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

@Properties(value = {
        @Platform(include = "engine.hpp", link = "engine")
})
public class EngineConfigurer implements InfoMapper {

    @Override
    public void map(InfoMap infoMap) {
    }
}
