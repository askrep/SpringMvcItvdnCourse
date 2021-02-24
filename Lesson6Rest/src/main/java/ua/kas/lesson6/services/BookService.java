package ua.kas.lesson6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kas.lesson6.domain.BookDao;
import ua.kas.lesson6.domain.Database;
import ua.kas.lesson6.dto.CreateBookRequest;

@Service
public class BookService {
    private final Database database;

    public BookService(Database database) {
        this.database = database;
    }

    public void createBook(CreateBookRequest createBookRequest) {
        BookDao bookDao = new BookDao(createBookRequest.getName(), createBookRequest.getAuthor());
        database.putBook(bookDao);
    }

    public int getNumberOfBooks() {
        return database.getNumberOfBooks();
    }
}
