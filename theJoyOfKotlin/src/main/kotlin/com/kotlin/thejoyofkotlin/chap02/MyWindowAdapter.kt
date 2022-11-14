package com.kotlin.thejoyofkotlin.chap02

import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent

/*
class 를 object라는 키워드로 바꾸기만 하면 쉽게 싱글톤을 만들 수 있음
싱글턴 객체에는 생성자가 있을 수 없음
프로퍼티가 있다면 반드시 초기화 해야함
 */
object MyWindowAdapter: WindowAdapter() {
    override fun windowClosed(e: WindowEvent?) {
        super.windowClosed(e)
    }
}