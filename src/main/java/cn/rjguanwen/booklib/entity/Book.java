package cn.rjguanwen.booklib.entity;

/**
 * @ClassName: Book
 * @Description: TODO
 * @Author: 郑斌
 * @Date: 2019/5/5 19:28
 **/
public class Book {

    // 书籍编号
    private Integer id;
    // 书籍名称
    private String bookName;
    // 出版社
    private String publisher;
    // 是否可借阅
    private String canBorrow;
    // 适宜年龄
    private String suitableAges;
    // 是否有拼音
    private String hasPinyin;
    // 是否英文
    private String isEnglish;
    // 存放位置
    private String storeArea;
    // 书籍标签
    private String bookTags;
    // 拥有者
    private Integer userId;
    // 备注
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCanBorrow() {
        return canBorrow;
    }

    public void setCanBorrow(String canBorrow) {
        this.canBorrow = canBorrow;
    }

    public String getSuitableAges() {
        return suitableAges;
    }

    public void setSuitableAges(String suitableAges) {
        this.suitableAges = suitableAges;
    }

    public String getHasPinyin() {
        return hasPinyin;
    }

    public void setHasPinyin(String hasPinyin) {
        this.hasPinyin = hasPinyin;
    }

    public String getIsEnglish() {
        return isEnglish;
    }

    public void setIsEnglish(String isEnglish) {
        this.isEnglish = isEnglish;
    }

    public String getStoreArea() {
        return storeArea;
    }

    public void setStoreArea(String storeArea) {
        this.storeArea = storeArea;
    }

    public String getBookTags() {
        return bookTags;
    }

    public void setBookTags(String bookTags) {
        this.bookTags = bookTags;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", publisher='" + publisher + '\'' +
                ", canBorrow='" + canBorrow + '\'' +
                ", suitableAges='" + suitableAges + '\'' +
                ", hasPinyin='" + hasPinyin + '\'' +
                ", isEnglish='" + isEnglish + '\'' +
                ", storeArea='" + storeArea + '\'' +
                ", bookTags='" + bookTags + '\'' +
                ", userId=" + userId +
                ", note='" + note + '\'' +
                '}';
    }
}
