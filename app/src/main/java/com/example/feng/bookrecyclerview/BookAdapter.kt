package com.example.feng.bookrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(var ctx: Context, var bookList: ArrayList<BookModel>): RecyclerView.Adapter<BookAdapter.BookCardViewHolder>() {

    class BookCardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var bookCover = itemView.findViewById<ImageView>(R.id.book_cover)
        var bookTitle = itemView.findViewById<TextView>(R.id.book_title)
        var bookAuthor = itemView.findViewById<TextView>(R.id.book_author)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookCardViewHolder {
        val newView = LayoutInflater.from(parent.context).inflate(R.layout.book_cardview, parent, false)
        return BookCardViewHolder(newView)
    }

    override fun onBindViewHolder(holder: BookCardViewHolder, position: Int) {
        var myBookCard: BookModel = bookList[position]
        holder.bookCover.setImageResource(myBookCard.bookCover!!)
        holder.bookTitle.text = myBookCard.bookTitle
        holder.bookAuthor.text = myBookCard.bookAuthor

        holder.bookCover.setOnClickListener {
            Toast.makeText(ctx, "You selected: " + myBookCard.bookTitle, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

}