package cn.rjguanwen.booklib.entity;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: 郑斌
 * @Date: 2019/3/22 9:14
 **/
public class User {

    private Integer userId;
    private String userName;
    private String password;
    private String aboutMe;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    @Override
    public String toString(){
        return "User{" +
                "userId=" + userId +
                ", userName=" + userName +
                ", password=" + password +
                ", aboutMe=" + aboutMe +
                "}";
    }
}
