package com.example.makanankekiniansurabaya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.daftar_makanan.view.*

class dataMadapter (val datamakananItemList: List<data_makanan>, val clickListener: (data_makanan) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.daftar_makanan,parent,false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(datamakananItemList[position],clickListener)
    }
    override fun getItemCount() = datamakananItemList.size

    class PartViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bind(data : data_makanan, clickListener: (data_makanan) -> Unit){
            itemView.gambar_fakultas.setImageResource(data.gambarM)
            itemView.namadaftarmakanan.text = data.namaM
            itemView.setOnClickListener{ clickListener(data)}
        }
    }
}