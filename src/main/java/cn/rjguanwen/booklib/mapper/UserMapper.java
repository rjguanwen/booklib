package cn.rjguanwen.booklib.mapper;

import cn.rjguanwen.booklib.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Description: TODO
 * @Author: 郑斌
 * @Date: 2019/3/22 9:32
 **/
@Repository
public interface UserMapper {
    User sel(int id);

    List<User> getAll();

    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "userId", column = "user_id"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "aboutMe", column = "about_me")
    })
    List<User> getAllByAno();

    @Select("SELECT * FROM user WHERE user_id = #{userId}")
    @Results({
            @Result(property = "userName", column = "user_name"),
            @Result(property = "aboutMe", column = "about_me")
    })
    User getOneByAno(int id);

    @Insert("INSERT INTO user(user_name,password,about_me) VALUES(#{userName}, #{password}, #{aboutMe})")
    void insertByAno(User user);

    @Update("UPDATE user SET user_name=#{userName},about_me=#{aboutMe} WHERE user_id =#{user_id}")
    void updateByAno(User user);

    @Delete("DELETE FROM user WHERE user_id =#{userId}")
    void deleteByAno(int id);
}
