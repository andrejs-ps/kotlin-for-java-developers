package for_java_devs.m6_oop._4object.anon

import java.awt.Frame
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

class KotlinWindow {

    init {
        val frame = Frame("Frame")
        frame.setSize(600, 400)
        frame.isVisible = true
        frame.addMouseListener(object : MouseAdapter() {
            override fun mouseClicked(e: MouseEvent) {
                println("Mouse clicked at: ${e.x}, ${e.y}")
            }
        })
    }
}

fun main() {
    KotlinWindow()
}