package demo;

import java.util.HashSet;
import java.util.Set;

// Java Collection
// 1) figure out the printed result
// 2) if the result is not expected, what's the problem?
// 3) how to solve it?
public class Quiz1 {

    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();

        books.add(new Book(1L, "Spring in Action"));
        books.add(new Book(1L, "Spring in Action")); // same book
        books.add(new Book(2L, "Microservice Patterns"));

        System.out.println(books.size()); // result?
    }
}

class Book {

    private Long id;
    private String title;

    public Book(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}
