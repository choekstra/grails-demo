package com.example

class Book {

    String title
    String author
    Integer pages

    static constraints = {
        title blank: false
        author blank: false
        pages nullable: true, min: 1
    }
}
