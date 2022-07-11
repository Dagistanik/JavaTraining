package randombook;

import interview.Book;

import java.util.*;

public class Library {
    private List <Book> books;
    protected Map <Integer, Book> bookMap;

    public Library(int maxBooks) {
        int id = 1;
        books = new ArrayList<>(maxBooks);
        bookMap = new HashMap<>();
        for (int i = 1; i <= maxBooks ; i++) {
            books.add(new Book(i, createTitle(), "author", "genre"));
            bookMap.put(i, books.get(i-1));
        }
//        for (int i = 0; i <= maxBooks ; i++) {
//
//        }
    }
    public List<Book> getBooks() {
        return books;
    }

    public Map<Integer, Book> getBookMap() {
        return bookMap;
    }

    public static String createTitle() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 100; // letter 'z' 122
        int targetStringLength = 3; // 10
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}

