package com.dragonchu.ibatis.knowledge.reflection;

public class Book {
    private String bookName;
    private Integer bookId;
    private String publish;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public Book(String bookName, Integer bookId, String publish) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.publish = publish;
    }
}
