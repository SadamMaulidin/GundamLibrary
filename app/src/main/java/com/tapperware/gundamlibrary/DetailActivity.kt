package com.tapperware.gundamlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val judulReview = intent.getStringExtra("judulReview")
        val hargaGundam = intent.getStringExtra("hargaGundam")
        val dataGundam = intent.getStringExtra("dataGundam")
        val gambarGundam = intent.getIntExtra("gambarGundam", 0)

        txtJudulReview.text = judulReview
        txtdataGundam.text = dataGundam
        harga.text = hargaGundam
        Glide.with(this).load(gambarGundam).into(imgGundam)
    }
}
