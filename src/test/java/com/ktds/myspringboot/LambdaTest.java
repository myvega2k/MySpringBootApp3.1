package com.ktds.myspringboot;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
    @Test
    void consumer() {
        List<String> stringList =
                List.of("Java", "Python", "Kotlin");//Immutable List
        //Anonymous Inner class
        stringList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("s = " + s);
            }
        });

        //Lambda Exepression
        stringList.forEach(val -> System.out.println(val));
        stringList.forEach(System.out::println);
    }

    @Test
    void runnable() {
        //class MyRunnable implements Runnable
        //Thread(new MyRunnable())
        //Anonymous Inner class
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner class");
            }
        });
        t1.start();
        //Lambda Expression
        Thread t2 = new Thread(() -> System.out.println("Lambda Expression") );
        t2.start();
    }
}
