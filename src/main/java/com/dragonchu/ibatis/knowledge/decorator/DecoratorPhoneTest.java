package com.dragonchu.ibatis.knowledge.decorator;

public class DecoratorPhoneTest {
    public static void main(String[] args) {
        System.out.println("普通手机没有录音功能");
        Phone telePhone = new TelePhone();
        telePhone.callIn();
        telePhone.callOut("Hello");

        System.out.println("装饰器装饰后的手机有录音功能");
        Phone decoratedPhone = new PhoneRecordDecorator(telePhone);
        decoratedPhone.callIn();
        decoratedPhone.callOut("hello");
    }
}
