package com.example.kotlinprac_1

class ClassName{
    val n = "className"

    fun hello(){
        println("hi hello")
    }

    init {
        // 인스턴스 생성 시 자동 호출
        println("ClassName init")
    }

    constructor(){ // 부생성자, 인스턴스 생성 시 자동 호출
        println("className sub")
    }
}

class ClassCon constructor(name:String){ // class ClassCon (name:String)
    // class ClassCon (val name:String) -> 바로 변수 선언 가능
    // class ClassCon (name:String = "default") -> 디폴트값 설정 가능
    val n = name

//    constructor(n:String) : this(name = "default"){ // 부생성자, 인스턴스 생성 시 자동 호출
//        println("className sub")
//    }
}

open class ClassOpen{ // 부모클래스로 사용하려면 open -> 기본적으로 final임
    open fun hello(){ // 메서드도 위와 동일
        println("ClassOpen hello")
    }
}

class Sub : ClassOpen(){ // extends대신 ":" 사용, 상속 시 부모클래스는 open
    override fun hello() {
        super.hello()
        println("override ClassOpen")
    }
}

fun main(){
    val cn = ClassName() // new 키워드 X
    val cc = ClassCon("ClassCon")
    val sub = Sub()
    cn.hello()
    println(cn.n)
    println(cc.n)
    sub.hello()
}