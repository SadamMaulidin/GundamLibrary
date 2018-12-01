package com.tapperware.gundamlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_urutannya.*
import org.jetbrains.anko.startActivity

class Urutannya : AppCompatActivity() {

    var items:MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_urutannya)

        val judulReview = resources.getStringArray(R.array.nama_gundam)
        val dataGundam = resources.getStringArray(R.array.data_gundam)
        val hargaGundam = resources.getStringArray(R.array.harga_gundam)
        val gambarGundam = resources.obtainTypedArray(R.array.foto_gundam)
        for (i in judulReview.indices){
            items.add(Item(judulReview[i], dataGundam[i], hargaGundam[i], gambarGundam.getResourceId(i, 0)))
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapters(this, items){
            startActivity<DetailActivity>("judulReview" to it.judul, "hargaGundam" to it.harga, "dataGundam" to it.detail, "gambarGundam" to it.gambar)
        }

    }
}
