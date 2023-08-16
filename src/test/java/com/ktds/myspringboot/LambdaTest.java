package com.ktds.myspringboot;

import org.junit.jupiter.api.Test;

public class LambdaTest {
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
    }
}
