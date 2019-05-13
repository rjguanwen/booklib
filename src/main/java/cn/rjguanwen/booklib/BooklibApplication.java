package cn.rjguanwen.booklib;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@MapperScan("cn.rjguanwen.booklib.mapper") //扫描的mapper
@SpringBootApplication
public class BooklibApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BooklibApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(BooklibApplication.class, args);
    }

}
