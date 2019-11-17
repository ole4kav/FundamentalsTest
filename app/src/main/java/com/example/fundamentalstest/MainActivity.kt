package com.example.fundamentalstest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvSum.text = OrdersAnalyzer().totalDailySales(getOrdersList()).toString()
    }

    private fun getOrdersList(): List<OrdersAnalyzer.Order>{
        val order1 = OrdersAnalyzer.Order(554,
                LocalDateTime.of(2017, 3, 25, 10, 35),
                listOf(
                        OrdersAnalyzer.OrderLine(9872, "Pencil", 3, 3.00)))

        val order2 = OrdersAnalyzer.Order(555,
                LocalDateTime.of(2017, 3, 25, 11, 24),
                listOf(
                        OrdersAnalyzer.OrderLine(9872, "Pencil", 2, 3.00),
                        OrdersAnalyzer.OrderLine(1746, "Eraser", 1, 1.00)))

        val order3 = OrdersAnalyzer.Order(453,
                LocalDateTime.of(2017, 3, 27, 14, 53),
                listOf(
                        OrdersAnalyzer.OrderLine(5723, "Pen", 4, 4.22),
                        OrdersAnalyzer.OrderLine(9872, "Pencil", 3, 3.12),
                        OrdersAnalyzer.OrderLine(3433, "Erasers Set", 1, 6.15)))

        val order4 = OrdersAnalyzer.Order(431,
                LocalDateTime.of(2017, 3, 20, 12, 15),
                listOf(
                        OrdersAnalyzer.OrderLine(5723, "Pen", 7, 4.22),
                        OrdersAnalyzer.OrderLine(3433, "Erasers Set", 2, 6.15)))

        val order5 = OrdersAnalyzer.Order(690,
                LocalDateTime.of(2017, 3, 26, 11, 14),
                listOf(
                        OrdersAnalyzer.OrderLine(9872, "Pencil", 4, 3.12),
                        OrdersAnalyzer.OrderLine(1746, "Marker", 5, 4.50)))

        return listOf(order1, order2, order3, order4, order5)
    }

}
