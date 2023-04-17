package com.example.crudroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.example.crudroom.data.db.DB
import com.example.crudroom.data.model.User
import com.example.crudroom.repo.DUsuarios
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DUsuarios.ctx=applicationContext

        lifecycleScope.launch{
                DUsuarios.saveUser(User(0,"Maria","Gomez","Diseño Web PRO","B"))

                DUsuarios.removeUser(User(2))
                var result:MutableList<User> = DUsuarios.list()



                for (item in result)
                    Log.i("result","${item.apellidos}, ${item.nombres}")
        }
    }
}