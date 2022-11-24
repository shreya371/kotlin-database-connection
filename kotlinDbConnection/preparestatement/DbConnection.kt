package com.axis.crud.preparestatement


import java.sql.Connection
import java.sql.DriverManager

class DbConnection {
    fun connect():Connection{
        val dburl ="jdbc:mysql://localhost:3306/kotlin"
        val connection= DriverManager.getConnection(dburl,"root","shreya123")
        return connection
    }
}