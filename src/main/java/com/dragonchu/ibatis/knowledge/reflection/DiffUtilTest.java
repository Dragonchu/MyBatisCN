package com.dragonchu.ibatis.knowledge.reflection;

import java.util.Map;

public class DiffUtilTest {
    public static void main(String[] args) {
        User oldUser = new User(100,"Tome");
        User newUser = new User(200,"Jack");
        Book oldBook = new Book("Cpp Concurrence",2031,"New Time");
        Book newBook = new Book("Big Data",30094,"New Time");
        Map<String,String> userDiffMap = diffUtil.diffObj(oldUser,newUser);
        Map<String,String> bookDiffMap = diffUtil.diffObj(oldBook,newBook);
        userDiffMap.entrySet().forEach(System.out::println);
        bookDiffMap.entrySet().forEach(System.out::println);
    }
}
