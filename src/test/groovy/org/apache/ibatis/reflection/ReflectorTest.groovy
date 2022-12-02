package org.apache.ibatis.reflection

import spock.lang.Specification

class ReflectorTest extends Specification {
    def "reflector construct"() {
        given:
        def reflector = new Reflector(TestReflectorBean.class)
    }
}
