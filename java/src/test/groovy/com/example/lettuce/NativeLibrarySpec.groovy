package com.example.lettuce

import spock.lang.Specification

class NativeLibrarySpec extends Specification {

    def "Test native library"() {
        given:
        def nativeClass = new NativeLibrary.NativeClass()
        nativeClass.set_property 'hello world'

        expect:
        println nativeClass.property()
    }
}
