package com.seogaemo.android_album

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seogaemo.android_album.databinding.ItemFrameBinding

class FrameAdapter(private val list : List<FrameItem>) : RecyclerView.Adapter<FrameAdapter.FrameViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FrameViewHolder {
        val inflater = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val binding = ItemFrameBinding.inflate(inflater, parent, false)
        return FrameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FrameViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

    class FrameViewHolder(private val binding: ItemFrameBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: FrameItem) {
            binding.frameImageView.setImageURI(item.uri)
        }
    }
}

