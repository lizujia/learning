package com.lizj.controller_03;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lizj.bean.Book;

@Controller
@RequestMapping("/book")
public class BookController {

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
    
    // 只有一个value属性, 所以可以省略; 没有method属性, 所以响应所有类型的请求
    @RequestMapping("/books")
    public ModelAndView getBooks() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
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
                            @RequestParam("auth") String author,
                            HttpServletRequest request) throws UnsupportedEncodingException {
        
        request.setCharacterEncoding("utf-8");
        
        Book book = new Book();
        book.setBookName(bookName);
        book.setAuthor(author);
        book.setId(books.size() + 1);
        books.add(book);
        
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        // 重定向,冒号后面不要有空格
        // 直接跳转(forward), 相当于又请求了一次/add, 自己试一下
        mv.setViewName("redirect:/book/books");
        return mv;
    }
    
}
