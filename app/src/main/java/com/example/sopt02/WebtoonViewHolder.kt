package com.example.sopt02

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class WebtoonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val img_webtoon = itemView.findViewById<ImageView>(R.id.img_webtoon)
    val title = itemView.findViewById<TextView>(R.id.title)

    fun bind(webtoonData: WebtoonData){
        title.text = webtoonData.title
        Glide.with(itemView).load(webtoonData.img_webtoon).into(img_webtoon)
    }
}