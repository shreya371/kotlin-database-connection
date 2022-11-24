package com.axis.crud.preparestatement

import com.axis.dbconnection.Dbconnection
import java.util.*

fun main(){
    var sc= Scanner(System.`in`)
    var dbconnection=Dbconnection()
    var connection=dbconnection.connect()

    println("enter id")
    var id=sc.nextInt()
    println("enter name")
    var name=sc.next()

    var prepareStmt=connection.prepareStatement("update userdb set name=? where id=?")
    prepareStmt.setString(1,name)
    prepareStmt.setInt(2,id)
    var res=prepareStmt.executeUpdate()
    if (res>0) println("updated successfully")
    else println("record do not exist")

}