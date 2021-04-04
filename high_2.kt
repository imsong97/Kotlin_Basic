package com.example.kotlinprac_1

fun main(){
    val value = Hello("str1", "str2")
    val value1 = HelloNomal("str1", "str2")
    println(value) // data class -> 데이터 값 반환
    println(value1) // class -> 메모리 주소값 반환

    val co1 = Hi.create() // 또는 Hi.Companion.create()
    println(co1.a)
    println(co1.b)
}

// data class
data class Hello(val a:String, val b:String)

class HelloNomal(val a:String, val b:String)

// ==============================================================================
// companion object

class Hi private constructor(val a:Int, val b:String){
    companion object CoHi { // static 역할, 이름 생략 가능, 상속 가능
        fun create() = Hi(1, "str")
    }
}
