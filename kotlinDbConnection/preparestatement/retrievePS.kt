package com.axis.crud.preparestatement

import com.axis.crud.createstatement.User

fun main(){
    var dbConnection=DbConnection()
    var connection=dbConnection.connect()

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