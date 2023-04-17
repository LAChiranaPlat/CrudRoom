package com.example.crudroom.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.crudroom.data.model.User

@Dao
interface UserDao {

    @Query("SELECT * FROM usuarios")
    suspend fun listarTodo(): MutableList<User>

    @Query("SELECT * FROM usuarios WHERE lname LIKE '%' || :str || '%'")
    suspend fun listarPorApellidos(str: String): List<User>

    @Insert
    suspend fun insertar(user: User): Long

    @Update
    suspend fun actualizar(user: User): Int

    @Delete
    suspend fun eliminar(user: User): Int

}
