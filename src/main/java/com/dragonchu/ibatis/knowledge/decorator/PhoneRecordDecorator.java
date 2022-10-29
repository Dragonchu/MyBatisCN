package com.dragonchu.ibatis.knowledge.decorator;

public class PhoneRecordDecorator implements Phone{
    //加强旧有方法
    private final Phone decoratedPhone;
    public PhoneRecordDecorator(Phone decoratedPhone){
        this.decoratedPhone = decoratedPhone;
    }
    @Override
    public String callIn() {
        System.out.println("启动录音......");
        String info = decoratedPhone.callIn();
        System.out.println("结束录音并保存录音文件......");
        return info;
    }

    @Override
    public Boolean callOut(String info) {
        System.out.println("启动录音......");
        Boolean res = decoratedPhone.callOut(info);
        System.out.println("结束录音并保存录音文件......");
        return res;
    }
}
