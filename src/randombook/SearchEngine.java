package randombook;

import interview.Book;

import java.util.*;
import java.util.stream.Collectors;

public class SearchEngine {

    private  Library library;

    public SearchEngine(Library library) {
        this.library = library;
    }


    public Book findById(String id){
        return findById4(id);
    }

    /**
     * find by id using Stream
     * @param idStr
     * @return
     */
    private Book findById1(String idStr){
        List<Book> books = library.getBooks();
        int id = Integer.parseInt(idStr);
//        String idStr = String.valueOf(id);
//        List coll2 = books.stream()
//                .filter(c -> String.valueOf(c.getId()).equals(idStr))
//                .collect(Collectors.toList());
        Book bookId = books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
        return bookId;
    }

    /**
     * find by id using for loop
     * @param id
     * @return
     */
    private Book findById2(String id){
        List<Book> books = library.getBooks();
        int x = Integer.parseInt(id);
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if(book.getId() == x) {
                return book;
            }
        }
        return null;
    }

    /**
     * find by id using forEach
     * @param id
     * @return
     */
    private Book findById3(String id){
        List<Book> books = library.getBooks();
        int x = Integer.parseInt(id);
        for (Book book : books){
            if(book.getId() == x){
                return book;
            }
        }
        return null;
    }

    /**
     * find by id using Map
     *
     * @param id
     * @return
     */
    private Book findById4(String id){
        Map <Integer, Book> map = library.getBookMap();
        int x = Integer.parseInt(id);
        return map.get(x);
    }


    public Book findOneByTitle(String keyword){
        return findOneByTitle1(keyword);
    }

    /**
     * find by title using stream
     * @param keyword
     * @return
     */
    Book findOneByTitle1(String keyword){
        List<Book> books = library.getBooks();
        Book book = books.stream()
                .filter(book1 -> book1.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .findFirst()
                .orElse(null);
        return book;
    }

    /**
     * find by title using for loop
     * @param keyword
     * @return
     */
    Book findOneByTitle2(String keyword){
        List<Book> books = library.getBooks();
        for (int i = 0; i <= books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(keyword)){
                return book;
            };
        }
        return null;
    }

    /**
     * find by title using forEach
     * @param keyword
     * @return
     */
    Book findOneByTitle3(String keyword){
        List<Book> books = library.getBooks();
        for (Book book : books){
            if (book.getTitle().equals(keyword)){
                return book;
            }
        }
        return null;
    }

    /**
     * find by title using Map
     * @param keyword
     * @return
     */
    public Book findOneByTitle4(String keyword){
        Map<Integer, Book> books = library.bookMap;
        for (Book book : books.values()){
            if (book.getTitle().equals(keyword)){
                return book;
            }
        }
        return null;
    }




    List<Book> findManyByTitle(String keyword){
        return null;
    }

}
