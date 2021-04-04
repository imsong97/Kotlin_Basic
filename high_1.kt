package com.example.kotlinprac_1

// 람다식 -> 자바스크립트 익명함수
val lamda:(Int) -> Int = { // 괄호 필수
    number -> number*number
}
//또는
val lamda2 = {
    number:Int -> number*number
}

fun main(){
    println(lamda(3))

    val a = "a"
    val b = "b"
    println(a.func())
    println(b.func())

    println(a.extendString(55))

    println(invoke(2.0)) // 4.1이 아니므로 false 반환
}

//확장함수
val func:String.() -> String = {
    this + " 확장함수"
}

val extendString:String.(Int) -> String ={
    // 파라미터가 1개일 경우 it 키워드 사용
    "extend ${this} and ${it}"
}

val calc: (Int) -> String = {
    when(it){
        in 0..10 -> "1"
        in 11..20 -> "11"
        else -> "else"
        // expression 이므로 else 필수
    }
}

val invoke = {
    number:Double -> number== 4.1
}