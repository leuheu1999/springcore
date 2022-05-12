package com.fis.spring.service;

import com.fis.spring.dao.SampleDao;

/**
 * com.fis.spring.service.SampleServiceImpl
 * Author TungHuynh - sondt18@fpt.com.vn
 * Date 21-Mar-22 03:47 PM
 */
public class SampleServiceImpl implements SampleService {
    SampleDao sampleDao;

    /**
     * Sử dụng với <constructor-arg ref="sampleDao" />
     * @param sampleDao
     */
    public SampleServiceImpl(SampleDao sampleDao) {
        this.sampleDao = sampleDao;
    }

    /**
     * Sử dụng với <property name="sampleDao" ref="sampleDao" />
     */
//    public void setSampleDao(SampleDao sampleDao) {
//        this.sampleDao = sampleDao;
//    }

    @Override
    public void printSampleMessage() {
        sampleDao.printMessage();
    }
}
