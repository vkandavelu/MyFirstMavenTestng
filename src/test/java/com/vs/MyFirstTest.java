package com.vs;

import org.testng.annotations.Test;

public class MyFirstTest {
    String msg = System.getProperty("name");
    String id = System.getProperty("UX");
   @Test
    public void test1()
    {

        System.out.println("Test 1 pass "+msg);
        System.out.println("Test 1 pass with id"+id);
        System.out.println("Test 1 pass with id"+id+" "+msg);
        System.out.println("Test 1 pass with id checks"+id+" "+msg);
        System.out.println("Test 1 pass with id checks"+id+" "+msg+"");
    }
    @Test
    public void test2()
    {
        System.out.println("Test 2 pass "+msg);
    }
}
