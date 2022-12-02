package org.apache.ibatis.reflection.factory

import org.apache.ibatis.reflection.ReflectionException
import spock.lang.Specification

class DefaultObjectFactoryTest extends Specification {
    def "createTest"() {
        given:
        def defaultObjectFactory = new DefaultObjectFactory()
        when:
        def userCreated = defaultObjectFactory.create(TestUser.class)
        and: "Create使用无参构造函数"
        then:
        with(userCreated) {
            id == null
            name == null
        }
    }

    def "createReflectionExceptionTest"() {
        given:
        def defaultObjectFactory = new DefaultObjectFactory()
        when:
        defaultObjectFactory.create(TestBook.class)
        and: "Create时没有无参构造函数会抛出异常"
        then:
        thrown ReflectionException
    }

    def "createWithArgsTest"() {
        given:
        def defaultObjectFactory = new DefaultObjectFactory()
        def constructorArgTypes = [String.class, Integer.class]
        def constructorArgs = ["cpp concurrency", 1]
        when:
        def res = defaultObjectFactory.create(TestBook.class, constructorArgTypes, constructorArgs)
        and: "调用有参构造函数"
        then:
        with(res) {
            name == "cpp concurrency"
            id == 1
        }
    }
    
}
