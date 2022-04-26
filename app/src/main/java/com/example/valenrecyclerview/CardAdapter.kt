package com.example.valenrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.valenrecyclerview.databinding.CardCellBinding

class CardAdapter(private val books: List<Book> )
    : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
    val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
    return CardViewHolder(binding)
    }
// mendeklarasikan variable from yang samadengan layoutinflator dari parent context, value binding samadengan cardcell binding//
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
    holder.bindBook(books[position])
    }
// memanggil holder yaitu function bindbook  //
    override fun getItemCount(): Int = books.size
    }
// akan mengembalikan booksize //