@file:JvmName("MyCustomKotlinFileName")    //The compiler will simply give this ("Main.kt") file name
                                                 //while converting into the bytecode as my "MyCustomKotlinFileName"
package com.myMainkotlin

import com.myjava.MyJavaFile


fun main() {

    var area = MyJavaFile.getArea(10, 5);
    println("Printing area from Kotlin file : " + area)

}

fun add(a: Int, b: Int): Int{
    return a + b
}

/**
 * public class MyCustomKotlinFileName {
 *
 *      public static void main(String[] args){
 *
 *      }
 *
 *      public static int add(int a, int b) {
 *            return a + b;
 *      }
 *
 * }
 *
 */



