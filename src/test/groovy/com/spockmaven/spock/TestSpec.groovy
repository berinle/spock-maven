package com.spockmaven.spock

import spock.lang.Specification

/**
 * @author berinle
 */
class TestSpec extends Specification {

    def "test something cool"(){
        expect:
        1==2
    }
}
