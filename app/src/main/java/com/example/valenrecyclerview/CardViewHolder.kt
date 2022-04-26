package com.example.valenrecyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.valenrecyclerview.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindBook(book: Book)
    {
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.title.text = book.title
        cardCellBinding.author.text = book.author
// fungsi bindbook mengatur tampilan bedasarkan buku yang diterima sehingga cardCellBinding.cover akan menampilkan cover, cardCellBinding.title akan menampilkan judul, cardCellBinding.author akaan menampilkan pengarang //
    }
}
// pada class cardviewholder merupakan recycler view yang akan mengambil variable dari cardcellbinding  dari file cardcell.xml yang sudah dibuat sebelumnnya //