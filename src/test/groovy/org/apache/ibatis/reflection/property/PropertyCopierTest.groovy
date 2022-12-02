package org.apache.ibatis.reflection.property

import spock.lang.Specification

class PropertyCopierTest extends Specification {
    def "CopyBeanProperties"() {
        given:
        def sourceBean = new TestProperty("beanOne", 100)
        def destinationBean = new TestProperty()
        when:
        PropertyCopier.copyBeanProperties(TestProperty.class, sourceBean, destinationBean)
        then:
        destinationBean.with {
            name == "beanOne"
            id == 100
        }
    }
}
