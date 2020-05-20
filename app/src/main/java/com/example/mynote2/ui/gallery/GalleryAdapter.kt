package com.example.mynote2.ui.gallery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mynote2.R
import kotlinx.android.synthetic.main.rv_gallery.view.*

class GalleryAdapter: RecyclerView.Adapter<GalleryAdapter.MyViewHolder>() {

    val list = mutableListOf("ic_menu_camera", "ic_menu_gallery", "ic_menu_slideshow")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_gallery, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(txt: String, position: Int) = with(itemView){
            textView_gallery.text = txt
            when(position){
                0 -> imageView_gallery.setImageDrawable(itemView.context.getDrawable(R.drawable.ic_menu_camera))
                1 -> imageView_gallery.setImageDrawable(itemView.context.getDrawable(R.drawable.ic_menu_gallery))
                2 -> imageView_gallery.setImageDrawable(itemView.context.getDrawable(R.drawable.ic_menu_slideshow))
            }
        }
    }
}