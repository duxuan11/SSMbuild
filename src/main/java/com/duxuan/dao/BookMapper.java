package com.duxuan.dao;

import com.duxuan.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

public interface BookMapper {
    //获取全部书籍
    public List<Books> queryAllBooks();

    //添加书籍
    public int addBook(Books book);

    //删除书籍
    public int deleteBook(int id);

    //修改书籍
    public int updateBook(Books book);

    //按名称搜索书籍
    public List<Books> queryBookByName(String bookName);

    public Books queryBookById(int id);
}
