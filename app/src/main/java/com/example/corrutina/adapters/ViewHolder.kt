package com.example.corrutina.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.corrutina.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)

    fun bind(image: String){
        Picasso.get().load(image).into(binding.ivDog)
    }
}