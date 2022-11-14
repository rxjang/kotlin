// 자바와 달리 코틀린에는 checked exception이 없다.
val num: Int = try {
    args[0].toInt()
} catch (e: Exception) {
    0
} finally {
    // 이 블록 안에 있는 코드는 항상 실행됨
}
// try ... catch... finally 가 반환하는 값은 예외가 발생하지 않으면 try 블록의 마지막 줄을 평가한 값이고, 예외가 발생하면 catch 블록의 마지막 줄을 평가한 값이다.