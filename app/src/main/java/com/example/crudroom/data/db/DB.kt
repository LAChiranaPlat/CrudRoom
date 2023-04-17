package com.example.crudroom.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.crudroom.data.dao.UserDao
import com.example.crudroom.data.model.User

@Database(
    entities = [User::class],
    version = 1,
    exportSchema = false
)

abstract class DB:RoomDatabase() {

    abstract val user:UserDao

    companion object{
        @Volatile
        private var INSTANCIA:DB?=null

        fun getInstance(ctx: Context):DB{

            synchronized(this){

                var instanciaDB= INSTANCIA

                if(instanciaDB==null)
                {
                    instanciaDB= Room.databaseBuilder(
                        ctx.applicationContext,
                        DB::class.java,
                        name="student"
                    ).fallbackToDestructiveMigration().build()

                    INSTANCIA=instanciaDB
                }

                return instanciaDB

            }
        }

    }

}