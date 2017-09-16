package com.lizj.dao;

import java.util.ArrayList;
import java.util.List;

import com.lizj.bean.Book;

public class BookDao {

    // 模拟数据库存储
    private static List<Book> books;
    
    {
        books = new ArrayList<Book>();
        for(int i=1; i<=10; i++) {
            Book book = new Book();
            book.setId(i);
            book.setBookName("书名" + i);
            book.setAuthor("作者" + i);
            books.add(book);
        }
    }
    
    public List<Book> queryAllBooks() {
        return books;
    }
    
    public int insertBook(Book book) {
        book.setId(books.size() + 1);
        books.add(book);
        return book.getId();
    }
    
    public Book queryBookById(int id) {
        for(int i=0; i<books.size(); i++) {
            Book book = books.get(i);
            if(book.getId() == id) {
                return book;
            }
        }
        return null;
    }
    
}
