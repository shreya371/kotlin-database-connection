package com.axis.crud.createstatement

import java.sql.DriverManager

fun main(){
    val dburl ="jdbc:mysql://localhost:3306/kotlin"
    val connection= DriverManager.getConnection(dburl,"root","shreya123")
    println("connection established")


//   insert query -Create
    val update_res = connection.createStatement().executeUpdate("delete from userdb where id = 1")
    if( update_res > 0){
        println("successfully updated record in users db !!!")
        println("$update_res deleted")
    } else{
        println("delete Not sucessful")
    }
}