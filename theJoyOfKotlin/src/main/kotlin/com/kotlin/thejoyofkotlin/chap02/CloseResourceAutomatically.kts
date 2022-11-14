import java.io.File

// use함수 블록을 멋어나면 입력 스트림이 자동으로 닫혀야 하기 때문에 더 이상 스트림을 쓸 수 없다.
File("myFile.txt").inputStream()
    .use {
        it.bufferedReader()
            .lineSequence()
            .forEach(::println)
    }

/*
이 코드는 컴파일 되지만 실행 시점에 IOException: Stream closed 오류가 발생한다.
시퀀스의 내용을 나중에 사용하려며 use 블록을 멋어나기 전에 스트림을 강제로 계산해야 한다.
 */
val lines: Sequence<String> = File("myFile.txt")
    .inputStream()
    .use {
        it.bufferedReader()
            .lineSequence()
    }
lines.forEach(::println)

/*
이렇게 처리하면 파일 전체를 메모리에 저장한다는 문제가 있다.
파일을 한 줄씩 처리하고 싶다면 좀 더 단순한 방법으로 forEachLine 함수를 사용하면 된다.
 */
val lines2: List<String> = File("myFile.txt")
    .inputStream()
    .use {
        it.bufferedReader()
            .lineSequence()
            .toList()
    }
lines2.forEach(::println)

File("myFile.txt").forEachLine { println(it) }
File("myFile.txt").useLines { it.forEach(::println) }
