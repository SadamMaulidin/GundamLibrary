package com.tapperware.gundamlibrary

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGo.setOnClickListener {
            val pindah = Intent(this, Urutannya::class.java)
            startActivity(pindah)
        }
    }
}
