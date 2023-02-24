package com.example.feng.bookrecyclerview

class BookModel {

    var bookCover: Int?
    var bookTitle: String?
    var bookAuthor: String?

    constructor(bookCover: Int, bookTitle: String, bookAuthor: String) {
        this.bookCover = bookCover
        this.bookTitle = bookTitle
        this.bookAuthor = bookAuthor
    }
}