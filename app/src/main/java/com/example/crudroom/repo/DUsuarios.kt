package com.example.crudroom.repo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.example.crudroom.data.db.DB
import com.example.crudroom.data.model.User

object DUsuarios {

    var ctx:Context?=null

    suspend fun saveUser(user:User){
            DB.getInstance(ctx!!.applicationContext).user.insertar(user)
    }

    suspend fun removeUser(user:User){
        DB.getInstance(ctx!!.applicationContext).user.eliminar(user)
    }

    suspend fun list():MutableList<User>{
        return DB.getInstance(ctx!!.applicationContext).user.listarTodo()
    }
}