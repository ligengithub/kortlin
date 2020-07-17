package com.demo.kotlin

/**
 * @title: KotlinDemo1
 * @projectName java
 * @description:
 * @author ligen
 * @date 2020/7/614:53
 */

/**
 *@ desc : main 方法为入口函数
 *@ author: ligen
 *@ date
 */
fun main() {
    println("hello world!")

    // 方法调用
    val sum = fun0(1, 3)
    println(sum)

    fun1(1,2)

    fun2()


    test()
}

/**
 *@ desc :  方法定义
 *@ author: ligen
 *@ date 2020/7/6
 */
fun fun0(x: Int, y: Int): Int {
    return x + y
}

/**
 *@ desc : 表达式作为函数体，类型自动推断
 *@ author: ligen
 *@ date 2020/7/6
 */
fun fun1(x: Int, y: Int) = x + y

/**
 *@ desc : 无意义的返回值Uint 此时Uint 可以省略
 *@ author: ligen
 *@ date 2020/7/6
 */
fun fun2(){
println(1)
}


/**
 *@ desc :  变量定义  val  和var
 * var 可变变量  val 只读变量，相当于java 中的final
 *@ author: ligen
 *@ date 2020/7/6
 */

fun test() {
    val a = 1
    var b = 3
    b+=1
    print("a=$a,b=$b")
}



/**
 *@ desc : 表达式
 *@ author: ligen
 *@ date 2020/7/6
 */
fun express0(){

    var a = 1
    var b = 2

    val max = maxOf(a, b)
    println(max)

    // if 也可做表达式
    var c = if (a>b) a else b

}


