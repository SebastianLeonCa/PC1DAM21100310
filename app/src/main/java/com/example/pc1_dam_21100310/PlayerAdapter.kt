package com.example.pc1_dam_21100310

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlayerAdapter(private var lstPlayer: List<PlayerModel>) {
        RecyclerView.Adapter<PlayerAdapter.ViewHolder>(){

        class ViewHolder(itemView: android.view.View): RecyclerView.ViewHolder(itemView){

            val ivSong: ImageView = itemView.findViewById(R.id.ivSong)
            val tvAlbum: TextView = itemView.findViewById(R.id.tvAlbum)
            val tvSong: TextView = itemView.findViewById(R.id.tvSong)
            val tvCountPlay: TextView = itemView.findViewById(R.id.tvCountPlay)
            val tvSongTime: TextView = itemView.findViewById(R.id.tvSongTime)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return ViewHolder(layoutInflater.inflate(R.layout.item_musica
                , parent, false))
        }

        override fun getItemCount(): Int {
            return lstSong.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val itemSong = lstSong[position]
            holder.ivSong.setImageResource(itemSong.image)
            holder.tvAlbum.text = itemSong.album
            holder.tvSong.text = itemSong.songName
            holder.tvSongTime.text = itemSong.songTime
            holder.tvCountPlay.text = itemSong.countPlay
        }
}