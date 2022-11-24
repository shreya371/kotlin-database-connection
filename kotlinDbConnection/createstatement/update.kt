package com.axis.crud.createstatement

import java.sql.DriverManager

fun main(){
    val dburl ="jdbc:mysql://localhost:3306/kotlin"
    val connection= DriverManager.getConnection(dburl,"root","shreya123")
    println("connection established")

    //update
    val update_res = connection.createStatement().executeUpdate("update userdb set name = 'shreya2' where id = 2")
    if( update_res > 0){
        println("successfully updated record in users db !!!")
        println("$update_res updated")
    } else{
        println("Update Not successful")
    }
}