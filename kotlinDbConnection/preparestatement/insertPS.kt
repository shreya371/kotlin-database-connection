package com.axis.crud.preparestatement

import java.util.*

fun main(){

    var dbconnect=DbConnection()
    var connection=dbconnect.connect()

    var sc= Scanner(System.`in`)
    println("enter id")
    var id:Int=sc.nextInt()
    println("enter  name")
    var name:String=sc.next()
    var userobj= User(id,name)
    val prepareStmt=connection.prepareStatement("insert into userdb values(?,?)")
    prepareStmt.setInt(1,id)
    prepareStmt.setString(2,name)
    val res=prepareStmt.executeUpdate()
    if (res>0) println("inserted successfully")
    else println("record do not exist")




}