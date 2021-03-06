package interview;


import interview.Book;

import java.util.*;

public class ListsBooks {
    public static void main(String[] args) {
        Book book1 = new Book(1, "aaa", "Фил", "genre1");
        Book book2 = new Book(2, "bbb","Киря","genre2");
        Book book3 = new Book(3, "ccc", "Рома", "genre3");


        List<Book> list = new ArrayList<>();
        list.add(book3);
        list.add(book3);
        list.add(book1);
        list.add(book1);
        list.add(book2);
        list.add(book2);
        for(Book o : list){
            System.out.println("list : " + o);
        }

        System.out.println();


        List<Book> list2 = new ArrayList<>(list);
        list2.sort((o1, o2) -> Integer.compare((o2.getId()), o1.getId()));

        for (Object o : list2){
            System.out.println("lis2 : " + o);
        }

        System.out.println();

        List <Book> list3 = new ArrayList<>(list);
        list3.sort((o1, o2) -> o2.getTitle().compareTo(o1.getTitle()));
        for (Object o :list3){
            System.out.println("list3 : " + o);
        }

        System.out.println();
//        Comparator<Book> sortByAuthor = (o1, o2) -> o2.getAuthor().compareTo(o1.getAuthor());
//        Set<Book> set = new TreeSet<>(sortByAuthor);
        Set<Book> set = new LinkedHashSet<>(list);
//        set.addAll(list);
        for (Object o : set){
            System.out.println("set : " + o);
        }
    }
}
