package com.duxuan.service;

import com.duxuan.pojo.Books;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    //获取全部书籍
    public List<Books> queryAllBooks();
    //修改书籍

    //添加书籍
    public int addBook(Books book);

    //删除书籍
    public int deleteBook(int id);

    //修改书籍
    public int updateBook(Books book);

    //查询一本书
    public Books queryBookById(int id);

    //按名称搜索书籍
    public List<Books> queryBookByName(String bookName);
}
