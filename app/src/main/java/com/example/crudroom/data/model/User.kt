package com.example.crudroom.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName= "usuarios")
data class User(
    @PrimaryKey(autoGenerate = true)
    var id:Int=0,
    @ColumnInfo(name="name") var nombres:String="",
    @ColumnInfo(name="lname") var apellidos:String="",
    @ColumnInfo(name="curso") var programa:String="",
    @ColumnInfo(name="group") var grupo:String=""
)
