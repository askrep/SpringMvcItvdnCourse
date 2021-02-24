package ua.kas.lesson6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.kas.lesson6.dto.CreateBookRequest;
import ua.kas.lesson6.services.BookService;

@RestController
public class BookController {
    protected final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PutMapping("/books/create")
    public ResponseEntity putBook(@RequestBody CreateBookRequest createBookRequest) {
        bookService.createBook(createBookRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/books/numbers")
    public ResponseEntity getNumberOfBooks() {
        int numberOfBooks = bookService.getNumberOfBooks();
        return new ResponseEntity(numberOfBooks, HttpStatus.OK);
    }
}
