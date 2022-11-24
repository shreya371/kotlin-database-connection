package com.axis.crud.preparestatement

import com.axis.dbconnection.Dbconnection
import java.util.*

fun main(){
    var sc= Scanner(System.`in`)
    var dbconnection= Dbconnection()
    var connection=dbconnection.connect()

    println("enter id")
    var id=sc.nextInt()

    var prepareStmt=connection.prepareStatement("delete from userdb where id=?")
    prepareStmt.setInt(1,id)
    var res=prepareStmt.executeUpdate()
    if (res>0) println("deleted  successfully")
    else println("record do not exist")

}