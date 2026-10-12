package com.example

class BootStrap {

    def init = { servletContext ->
        Book.withTransaction {
            if (!Book.count()) {
                new Book(title: 'The Hobbit', author: 'J.R.R. Tolkien', pages: 310).save(failOnError: true)
                new Book(title: 'Dune', author: 'Frank Herbert', pages: 412).save(failOnError: true)
                new Book(title: 'Neuromancer', author: 'William Gibson', pages: 271).save(failOnError: true)
            }
        }
    }

    def destroy = {
    }
}
