package com.dragonchu.ibatis.knowledge.decorator;

public class PhoneWithMessage implements Phone{
    private Phone phone;
    public PhoneWithMessage(Phone phone){
        this.phone = phone;
    }

    @Override
    public String callIn() {
        return phone.callIn();
    }

    @Override
    public Boolean callOut(String info) {
        return phone.callOut(info);
    }

    //增加新功能
    public String getMessage(){
        return "获取短信";
    }
    public Boolean sendMessage(String message){
        System.out.println("发送短信");
        return true;
    }
}
