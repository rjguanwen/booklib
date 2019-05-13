package cn.rjguanwen.booklib.controller;

import cn.rjguanwen.booklib.entity.Book;
import cn.rjguanwen.booklib.service.BookService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * @ClassName: BookController
 * @Description: TODO
 * @Author: 郑斌
 * @Date: 2019/5/5 19:26
 **/
@RestController
@RequestMapping("/v1/book")
@Api(tags="书籍API")
public class BookController {

    @Autowired
    private BookService bookService;

    @ApiOperation(value="查询所有书籍")
    @RequestMapping(value="/getAllBooks", method=RequestMethod.GET)
    public List<Book> getBookListAll(){
        return bookService.getAllBooks();
    }

    @ApiOperation(value="按页查询书籍")
    @RequestMapping(value="/getBooksInPage", method=RequestMethod.GET)
    public List<Book> getBooksInPage(){
        PageHelper.startPage(1, 10);
        List list = bookService.getAllBooks();
        PageInfo page = new PageInfo(list);
//        System.out.println(page);
//        page.getTotal();
//        page.getPages();
//        page.getResult();
        return page.getList();
    }

    @RequestMapping(value="/getBook/{id}", method = RequestMethod.GET)
    @ApiOperation(value="根据ID查询书籍", notes = "查询数据库中书籍详细信息")
    @ApiImplicitParam(name="id", value="书籍id", required=true)
    public String getBook(@PathVariable int id){
        return bookService.getBook(id).toString();
    }

    @RequestMapping(value="/insertBook", method = RequestMethod.POST)
    public String insertBook(@RequestBody Book book){
        int i = bookService.insertBook(book);
        return "";
    }

    @RequestMapping(value="{id}",method = RequestMethod.DELETE)
    public String deleteBook( @PathVariable("id") int id) {
        bookService.deleteBook(id);
        return "";
    }
}
