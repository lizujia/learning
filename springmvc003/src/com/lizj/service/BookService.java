package com.lizj.service;

import java.util.List;

import com.lizj.bean.Book;
import com.lizj.dao.BookDao;

public class BookService {

    private BookDao bookDao;

    public List<Book> getAllBooks() {
        return bookDao.queryAllBooks();
    }
    
    public int addBook(Book book) {
        return bookDao.insertBook(book);
    }
    
    public Book getBookById(int id) {
        return bookDao.queryBookById(id);
    }
    
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    
}
