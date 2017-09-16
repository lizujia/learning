package com.lizj.controller_08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lizj.bean.Book;
import com.lizj.service.BookService;

@Controller
@RequestMapping("/book08")
public class BookController08 {

    @Autowired
    private BookService bookService;
    
    @RequestMapping("/books")
    public ModelAndView getBooks() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", bookService.getAllBooks());
        mv.setViewName("json/books");
        return mv;
    } 
    
    @RequestMapping(value="add", method=RequestMethod.GET)
    public String add() {
        return "json/addbook";
    }
    
    @RequestMapping(value="add", method=RequestMethod.POST)
    @ResponseBody
    public Book add(@RequestBody Book book) throws Exception {
        // 添加操作
        bookService.addBook(book);
        // 添加后回显到页面中
        return book;
    }
    
}
