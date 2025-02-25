package com.myjava;


import com.myMainkotlin.MyCustomKotlinFileName;

public class MyJavaFile {

    public static void main(String[] args){

          int sum = MyCustomKotlinFileName.add(3, 4);
          System.out.println("Printing sum from java file :" + sum);

    }

    public static int getArea(int l, int b) {
        return l*b;
    }


}
