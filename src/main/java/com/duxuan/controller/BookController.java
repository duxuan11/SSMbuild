package com.duxuan.controller;

import com.duxuan.pojo.Books;
import com.duxuan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    @RequestMapping("/allBook")
    public String queryAllBook(Model model){
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list",list);
        return "allBook";
    }
    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable int id,Model model){
        bookService.deleteBook(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook(){

        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books book){
        bookService.addBook(book);
        return "redirect:/book/allBook";
    }

    //跳转到修改页面
    @RequestMapping("/toUpdateBook/{id}")
    public String toUpdatePaper(@PathVariable int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBbooks",books);
        model.addAttribute("id",id);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books book){
        bookService.updateBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public String queryBoookByName(String queryBookName,Model model){
        List<Books> list = bookService.queryBookByName(queryBookName);
        for (Books books : list) {
            System.out.println(books);
        }
        if (list.isEmpty()){
            list = bookService.queryAllBooks();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        return "allBook";
    }
}
