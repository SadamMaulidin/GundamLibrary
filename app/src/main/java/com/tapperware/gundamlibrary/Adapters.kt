package com.tapperware.gundamlibrary

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.view.*
import kotlinx.android.synthetic.main.activity_review_gundam.view.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class Adapters (val context: Context, val items: List<Item>, val listener: (Item) -> Unit): RecyclerView.Adapter<Adapters.ViewHolder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_review_gundam, viewGroup, false)
        return ViewHolder(view)    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bindItem(items[position], listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val judulReview = view.namaGundam
        val hargaGundam = view.hargaGunpla
        val gambarGundam = view.reviewPic

        fun bindItem (item: Item, listener: (Item) -> Unit){
            judulReview.text = item.judul
            hargaGundam.text = item.harga
            Glide.with(itemView.context).load(item.gambar).into(gambarGundam)
            itemView.onClick {
                listener(item)
            }
        }
    }



}
