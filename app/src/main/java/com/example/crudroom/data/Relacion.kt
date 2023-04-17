package com.example.crudroom.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.example.crudroom.data.model.User

@Entity(tableName = "detalle_pedido",

    foreignKeys = [

        ForeignKey(
            entity = User::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("idAlumno"),
            onDelete = ForeignKey.CASCADE,

        ),

       /* ForeignKey(
            entity = GRUPO::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("idGrupo"),
            onDelete = ForeignKey.CASCADE
        )*/

    ]

)
data class Relacion(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id: Int = 0,
    @ColumnInfo(name = "idAlumno", index = true) var idAlumno: Int = 0,
    @ColumnInfo(name = "idGrupo", index = true) var idGrupo: Int = 0,

)