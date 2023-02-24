package com.example.feng.bookrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var bookRecyclerView: RecyclerView
    lateinit var newLayoutManager: GridLayoutManager
    lateinit var bookList: ArrayList<BookModel>
    lateinit var myAdapter: BookAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bookRecyclerView = findViewById(R.id.book_recycler_view)
        newLayoutManager = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        bookRecyclerView.layoutManager = newLayoutManager
        bookRecyclerView.setHasFixedSize(true)

        bookList = setUpData()

        myAdapter = BookAdapter(applicationContext, bookList)
        bookRecyclerView.adapter = myAdapter
    }

    private fun setUpData(): ArrayList<BookModel> {

        var bookList = ArrayList<BookModel>()

        val bookTitles = arrayOf(
            "Kindred",
            "Hamlet",
            "The Awakening",
            "Fireborne",
            "1984",
            "The Poisonwood Bible",
            "Burn",
            "The Raven Boys",
            "The Lightning Thief",
            "The Hunger Games"
        )

        val bookAuthors = arrayOf(
            "Octavia Butler",
            "William Shakespeare",
            "Kate Chopin",
            "Rosaria Munda",
            "George Orwell",
            "Barbara Kingsolver",
            "Patrick Ness",
            "Maggie Stiefvater",
            "Rick Riordan",
            "Suzanne Collins"
        )

        val bookCovers = intArrayOf(
            R.drawable.kindred_cover,
            R.drawable.hamlet_cover,
            R.drawable.awakening_cover,
            R.drawable.fireborne_cover,
            R.drawable.nineteeneightyfour_cover,
            R.drawable.poisonwoodbible_cover,
            R.drawable.burn_cover,
            R.drawable.raven_boys_cover,
            R.drawable.lightning_thief_cover,
            R.drawable.hunger_games_cover
        )

        for (i in bookTitles.indices)
            bookList.add(BookModel(bookCovers[i], bookTitles[i], bookAuthors[i]))

        return bookList


    }
}