package com.duxuan.service;

import com.duxuan.dao.BookMapper;
import com.duxuan.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("BookServiceImpl")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
