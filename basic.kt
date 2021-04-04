package com.example.kotlinprac_1

fun main(){ // entry point
    hello()
    add(1,2)

/*
* val -> const
* var -> let
* */
    val a = 10 // 선언과 동시에 할당 할 경우 타입 생략 가능
    var b = 100
    val c:String // 선언만 할 경우 타입 필수

    val name="name"
    val str="str"
    println("Name: $name")
    println("Name: ${name + str}")

    max(1,2)
    max2(1,2)

    repeat()
}

fun hello() : Unit{ // Unit -> void형 함수, 생략 가능
    println("Hello World")
}

fun add(a:Int, b:Int): Int{
    return a+b
}

fun max(a:Int, b:Int): Int{
    if(a>b)
        return a
    else
        return b
}
fun max2(a:Int, b:Int) = if (a>b) a else b // => 3항연산자 대신 사용

fun max3(a:Int){
    var num:Int
    when(a){ //switch문
        0->println()
        1->println()
        2,3->println()
        in 4..10->println()
        11-> num = a
        else->print("모두 해당 X")
    }

    var b = when(a){
        1->1
        2->2
        else->3 // 이 경우(expression), else 필수
    }
}

fun arr(){
    val ary = arrayOf(1,2,3) // Array<Int>
    val list = listOf(1,2,3) // List<Int>

    val ary2 = arrayOf(1,"1",1.2f) // Array<Any>
    val list2 = listOf(1,"1",1.2f) // List<Any>

    ary[0] = 3
    // list[0] = 3 -> 불가능 : List에는 List(읽기전용) vs MutableList(읽기쓰기) 2종류
    val res = list.get(0) // 읽기 전용

    val aryList = arrayListOf<Int>() // MutableList
    aryList.add(1)
    aryList[0] = 2
}

fun repeat(){
    val ary = arrayListOf(1,2,3,4,5)

    for (i in ary){
        println(i)
    }

    for (i in 1..10){ // 1~10 출력
        println(i)
    }

    for (i in 1 until 10){ // 1~9 출력
        println(i)
    }

    for (i in 1..10 step 2){ // 1 3 5 7 9 출력
        println(i)
    }

    for (i in 10 downTo 1){
        println(i)
    }

    var ind=0
    while(ind<10){
        println(ind)
        ind++
    }

    for((index,i) in ary.withIndex()){
        // index와 같이 쓸 수 있음
    }
}

fun optional(str:String?){
    //swift 의 옵셔널 -> ?, !
    var a:String?
    var b:String? = null
    var c = "str"

    var newA = b?.toUpperCase() // b.toUpperCase() 불가능
    var newStr = c + (b?:"str2") // b가 null일 경우 "str2" 출력

    var d:String = str!!
    var newB = d.toUpperCase() // 가능

    var i : String? = "i"
    i?.let{
        // null이 아니면 실행
    }
}


