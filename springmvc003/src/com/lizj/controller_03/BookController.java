package com.lizj.controller_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lizj.bean.Book;
import com.lizj.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;
    
    // 只有一个value属性, 所以可以省略; 没有method属性, 所以响应所有类型的请求
    @RequestMapping("/books")
    public ModelAndView getBooks() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", bookService.getAllBooks());
        mv.setViewName("book/books");
        return mv;
    }
    
    // 只响应get请求, 展示添加页面
    @RequestMapping(value="/add", method=RequestMethod.GET) 
    public String add() {
        return "book/add";
    }
    
    // 只响应post请求, 完成添加功能, 并展示列表页
    @RequestMapping(value="/add", method=RequestMethod.POST) 
    public ModelAndView add(@RequestParam("name") String bookName, 
                            @RequestParam("auth") String author) {
        
        Book book = new Book();
        book.setBookName(bookName);
        book.setAuthor(author);
        bookService.addBook(book);
        
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", bookService.getAllBooks());
        // 重定向,冒号后面不要有空格
        // 默认是请求转发(forward), 可以自己试一下效果
        mv.setViewName("redirect:/book/books");
        return mv;
    }
    
}
