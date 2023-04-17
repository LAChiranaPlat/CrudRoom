package com.example.crudroom.data.repo

import com.example.crudroom.data.dao.UserDao
import com.example.crudroom.data.model.User

class RepoUser(var dao: UserDao) {

    suspend fun listAll(){
        dao.listarTodo()
    }

    suspend fun save(user: User):Long{
        return dao.insertar(user)
    }

}