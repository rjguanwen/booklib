-- 创建数据库
create database book_lib default character set utf8 collate utf8_general_ci;

-- 书籍基础信息表，暂不使用，直接使用 books_in_one 代替
CREATE TABLE `book` (
	isbn varchar(13) NOT NULL,
	title varchar(120) NOT NULL,
	author varchar(120),
	pubdate varchar(8),
	origin_title varchar(140),
	binding varchar(32),
	pages INTEGER,
	images_medium varchar(256),
	images_large varchar(256),
	publisher varchar(100),
	isbn10 varchar(10),
	isbn13 varchar(13),
	summary varchar(1024),
	is_recommendation varchar(1),
	recommendation varchar(1024),
	CONSTRAINT BOOK_PK PRIMARY KEY (isbn)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 书籍库表，暂不使用，直接使用 books_in_one 代替
CREATE TABLE book_lib (
	book_id INTEGER NOT NULL AUTO_INCREMENT,
	isbn varchar(13) NOT NULL,
	user_name VARCHAR(32) NOT NULL,
	borrow_period INTEGER,
	in_use VARCHAR(1) NOT NULL,
	borrower VARCHAR(32) NOT NULL,
	begin_date VARCHAR(8),
	end_date VARCHAR(8),
	status VARCHAR(2) NOT NULL,
	recommendation VARCHAR(1024),
	CONSTRAINT BOOK_LIB_PK PRIMARY KEY (book_id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- DROP TABLE user;
-- 用户表
CREATE TABLE user (
	user_id INTEGER NOT NULL AUTO_INCREMENT,
	user_name VARCHAR(64),
	password VARCHAR(64) NOT NULL,
	about_me VARCHAR(140),
	CONSTRAINT USER_PK PRIMARY KEY (user_id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


-- DROP TABLE books_in_one;
-- 书籍信息表
CREATE TABLE books_in_one (
	id INTEGER NOT NULL AUTO_INCREMENT,
	book_name VARCHAR(100) NOT NULL,
	publisher VARCHAR(100),
	can_borrow CHAR(1) NOT NULL,
	suitable_ages VARCHAR(30),
	has_pinyin CHAR(1),
	is_english CHAR(1),
	store_area varchar(100),
	book_tags varchar(1024),
	user_id INTEGER,
	note varchar(512),
	CONSTRAINT BOOKS_IN_ONE_PK PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 书籍借阅记录表
CREATE TABLE book_borrow_record (
	id INTEGER NOT NULL AUTO_INCREMENT,
	book_id INTEGER NOT NULL,
	book_name VARCHAR(100) NOT NULL,
	borrow_user_id INTEGER NOT NULL,
	start_date DATETIME default CURRENT_TIMESTAMP,
	end_date DATETIME,
	note varchar(512),
	CONSTRAINT BOOK_BORROW_RECORD_PK PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- 通过csv文件载入数据，并修正部分字段内容，没啥用，仅记录
-- load data local infile '/tmp/book_data.csv' into table books_in_one fields terminated by ',' (book_name,publisher,can_borrow,suitable_ages,has_pinyin,is_english,store_area,book_tags,user_id,note);
-- update books_in_one set has_pinyin ='1' where has_pinyin ='是' ;
-- update books_in_one set has_pinyin ='0' where has_pinyin ='否' ;
-- update books_in_one set is_english ='1' where is_english ='是' ;
-- update books_in_one set is_english ='1' where is_english ='英' ;
-- update books_in_one set is_english ='0' where is_english ='否' ;
-- update books_in_one set is_english='2' where is_english ='双' ;
