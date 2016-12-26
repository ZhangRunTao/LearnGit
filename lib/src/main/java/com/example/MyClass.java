package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class MyClass {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("hello world");
        list.forEach(item->{
            System.out.println(item);
        });
        list.forEach(item->{
            System.out.println("wef");
        });

        Converter<String, Integer> converter = from -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123

        System.out.println(list.stream().findFirst().get());
        Objects.isNull(null);
    }

    public interface Anim{
        default void say(){
            System.out.println("123");
        }
    }

    public class User{
        public String name;

        public User(){

        }
    }

    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }


}
