package cn.rjguanwen.booklib.service;

import cn.rjguanwen.booklib.entity.Book;
import cn.rjguanwen.booklib.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: BookService
 * @Description: TODO
 * @Author: 郑斌
 * @Date: 2019/5/5 19:28
 **/
@Service
public class BookService {

    @Autowired
    private BookMapper bookMappper;

    public List<Book> getAllBooks(){
        return bookMappper.getAllBooks();
    }

    /**
     * 获取书籍详细信息
     * @param id
     * @return
     */
    public Book getBook(int id){
        return bookMappper.getBookDetail(id);
    }

    /**
     * 插入一条书籍记录
     * @param book
     * @return
     */
    public int insertBook(Book book){
        return bookMappper.insertBook(book);
    }

    public int updateBook(Book book){
        return bookMappper.updateBook(book);
    }

    public int deleteBook(int id){
        return bookMappper.deleteBook(id);
    }

}
