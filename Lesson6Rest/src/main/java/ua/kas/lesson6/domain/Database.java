package ua.kas.lesson6.domain;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Database {
    private Map<Integer, BookDao> map;

    public Database() {
        map = new HashMap<>();
    }

    public void putBook(BookDao bookDao) {
        if (map.isEmpty()) {
            map.put(1, bookDao);

        } else {
            map.put(map.size() + 1, bookDao);
        }
    }

    public int getNumberOfBooks() {
        return map.size();
    }
}
