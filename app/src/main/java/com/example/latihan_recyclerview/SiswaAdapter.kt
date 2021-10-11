package com.example.latihan_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SiswaAdapter(private val dataSet: Array<String>) :
    RecyclerView.Adapter<SiswaAdapter.SiswaHolder>() {
    class SiswaHolder(view: View): RecyclerView.ViewHolder(view) {
        val textView = itemView.findViewById<TextView>(R.id.txtNamaSiswa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SiswaHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.siswa_adapter,parent,false
        )
        return SiswaHolder(view)
    }

    override fun onBindViewHolder(holder: SiswaHolder, position: Int) {
        holder.textView.text = dataSet[position]
    }

    override fun getItemCount()= dataSet.size
}