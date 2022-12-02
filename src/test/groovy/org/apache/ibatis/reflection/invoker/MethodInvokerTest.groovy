package org.apache.ibatis.reflection.invoker

import spock.lang.Specification

class MethodInvokerTest extends Specification {
    def "Invoke"() {
        given:
        def translator = new TestTranslator("你好")
        def methodInvoker = new MethodInvoker(translator.getClass().getMethod("translate", String.class))
        when:
        def args = ["哟"] as Object[]
        def res = methodInvoker.invoke(translator, args)
        and: "调用指定对象的指定的函数"
        then:
        res == "哟你好"
    }

    def "GetType"() {
        given:
        def translator = new TestTranslator("你好")
        def methodInvoker = new MethodInvoker(translator.getClass().getMethod("translate", int.class))
        when:
        def res = methodInvoker.getType()
        and: "有且只有一个入参时，type为入参的class"
        then:
        res == int.class
    }

    def "GetTypeReturnType"() {
        given:
        def translator = new TestTranslator("你好")
        def methodInvoker = new MethodInvoker(translator.getClass().getMethod("translate"))
        when:
        def res = methodInvoker.getType()
        and: "无参或者参数多于一个时，tpye为返回值的class"
        then:
        res == long.class
    }
}
