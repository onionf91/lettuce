package com.example.lettuce

import org.bytedeco.javacpp.BytePointer
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
        engine.run()
        engine.run()

        cleanup:
        engine.deallocate()
        callback.deallocate()
    }

    def "Test pass parameter by pointer and value"() {
        given:
        def callback = new CallbackImpl()
        def engine = new Engine(callback)
        def msg = new tsNCharcb()
        msg.pData(new BytePointer('hello'))
        msg.iDataLen(543)

        expect:
        engine.print1 msg
        msg.pData(new BytePointer('world'))
        engine.print2 msg

        cleanup:
        engine.deallocate()
        callback.deallocate()
    }
}
