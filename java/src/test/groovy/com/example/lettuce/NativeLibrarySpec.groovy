package com.example.lettuce

import spock.lang.Specification

import static com.example.lettuce.EngineLibrary.*

class NativeLibrarySpec extends Specification {

    def "Test native library."() {
        given:
        def nativeClass = new NativeLibrary.NativeClass()
        nativeClass.set_property 'hello world'

        expect:
        println nativeClass.property()
    }

    def "Test engine callback."() {
        given:
        def callback = new CallbackImpl()
        def engine = new Engine(callback)

        expect:
        engine.run()

        cleanup:
        Util.cleanup engine
        Util.cleanup callback
    }
}
