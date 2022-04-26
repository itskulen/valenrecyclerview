package com.example.valenrecyclerview

import android.accounts.AuthenticatorDescription

var bookList = mutableListOf<Book>()

class Book(
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    val id: Int? = bookList.size
)
// class Book.kt mendeklarasikan variable yang ada di aplikasi ini yaitu cover, title, author dan description. Masing masing dari variable yang ada disini memiliki tipe data yang berbeda beda //