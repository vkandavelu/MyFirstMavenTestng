package com.vs;

import java.net.SecureCacheResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add {
    public static void main(String[] args) {

        int a =10+10;
        System.out.println("Adding-->"+a);
        subtract();

    }
   static void  subtract ()
    {
        int b =10-5;
        int i=0;
        List<Integer> li = new ArrayList<>();
        System.out.println("Subtract--->"+b);
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        while (i>=num)
            li.add(sc.nextInt());
        System.out.println(li);
    }
}
