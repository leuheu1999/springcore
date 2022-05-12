package com.fis.spring.dao;

/**
 * com.fis.spring.Sample
 * Author TungHuynh - sondt18@fpt.com.vn
 * Date 21-Mar-22 03:31 PM
 */
public class SampleDaoImpl implements SampleDao {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println("Message: " + message);
    }
}
