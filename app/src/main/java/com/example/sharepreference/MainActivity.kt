package com.example.sharepreference

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b = applicationContext.getSharedPreferences(NamePre, Context.MODE_PRIVATE).edit()
        val c = applicationContext.getSharedPreferences(NamePre, 0)
        n = c.getInt(VarStore,0)
        txt.text = n.toString()
        btn.setOnClickListener {
            n ++
            txt.text = n.toString()
            b.putInt(VarStore,n)
            b.apply()
        }
    }

    var n = 0
    val NamePre = "MyPre"
    val VarStore = "N"
}
