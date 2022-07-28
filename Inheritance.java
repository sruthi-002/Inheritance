package com.company;
import java.util.Scanner;
class Student {
        static String name = "Sruthi";
}
class Main extends Student{
    public static void main(String [] args)
    {
        int tamil;
        Scanner in = new Scanner(System.in);
        tamil = in.nextInt();
        Main m = new Main();
        System.out.println(name + " "+"got " + " "+ tamil);
    }
}
