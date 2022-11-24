package com.axis.crud.createstatement

import java.sql.DriverManager

data class User(val id:Int,val name:String)

fun main(){
    val dburl ="jdbc:mysql://localhost:3306/kotlin"
    val connection= DriverManager.getConnection(dburl,"root","shreya123")
    println("connection established")

    /*insert,update,delete
       execute()
       executeUpdate()
    */

    /*select/retrieve
         exequteQuery
    */

    //select all
    val query = connection.prepareStatement("select * from userdb")
    val result = query.executeQuery()
    val users = mutableListOf<User>()

    while(result.next()){
        val id = result.getInt("id")
        val name = result.getString("name")
        users.add(User(id, name))
    }
    for(user in users) {
        println(user)
    }
}
