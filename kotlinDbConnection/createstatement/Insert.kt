package com.axis.crud.createstatement

import java.sql.DriverManager

fun main(){
    val dburl ="jdbc:mysql://localhost:3306/kotlin"
    val connection= DriverManager.getConnection(dburl,"root","shreya123")
    println("connection established")

    //insert into table
    val stmt =connection.createStatement()
    val res = stmt.executeUpdate("insert into userdb values(1,'shreya')")

    if (res > 0) println("successfully inserted record into users db !!!")
    else println("Insert Not successful")

}