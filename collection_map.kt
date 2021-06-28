fun main() {
  // map -> key/value
  // {"key": "value"}

  var map = mapOf(Pair("key", "value")) // 수정 불가능

  var map2 = mutableMapOf<String, String>() // 수정 가능
  map2.put("key2", "value2")
  map2.put("11", "22")

  for(m in map2) {
    println(m) // key=value 형태로 출력
    println(m.key) // key값만 출력
    println(m.value) // value값만 출력
  }
}