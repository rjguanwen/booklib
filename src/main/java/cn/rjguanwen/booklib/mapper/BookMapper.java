package cn.rjguanwen.booklib.mapper;

import cn.rjguanwen.booklib.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: BookMapper
 * @Description: TODO
 * @Author: 郑斌
 * @Date: 2019/5/6 9:34
 **/
@Repository
public interface BookMapper {

    Book getBookDetail(int id);

    List<Book> getAllBooks();

    Book getBook(int id);

    int insertBook(Book book);

    int updateBook(Book book);

    int deleteBook(int id);
}
