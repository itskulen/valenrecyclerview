package com.example.valenrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import com.example.valenrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(bookList)
        }
    }
// pembuatan fungsi populate books,//
    private fun populateBooks()
    {
        val book1 = Book(
            R.drawable.komik1,
            "Stan Lee",
            "Deadpool",
            "Testing"
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.komik2,
            "Max Payne",
            "Black Panther",
            "Testing"
        )
        bookList.add(book2)

        val book3 = Book(
            R.drawable.komik3,
            "Erik Tan Haag",
            "Spiderman Noir",
            "Testing"
        )
        bookList.add(book3)

        val book4 = Book(
            R.drawable.komik4,
            "Jose Santos",
            "Incredible Hulk",
            "Testing"

        )
        bookList.add(book4)

        val book5 = Book(
            R.drawable.komik5,
            "Alexander William",
            "Iron Man",
            "Testing"
        )
        bookList.add(book5)
 // baris 15 hingga 66 adalah menginisialisasi pada objek book, dimana mengimpor gambar dari direktori drawable, lalu mengset title, author serta description dari masing-masing buku//
        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
    }
}