package com.postit.postit_.Objects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class note {
    private String college;
    private String major;
    private String course;
    private String chapterNum;
    private String title;
    private String caption;
    private String email;
    private String id;
    private String date;
    private note note;


    public note() {
        DateFormat df = new SimpleDateFormat("dd MMMM yyyy");
        Date dateobj = new Date();
        date = df.format(dateobj);
    }

//    public note(String requestedMajorS, String requestedCourseS, String requestedChapterS, String requestID) {
//
//    }

//    public note(String college, String major, String course, String chapterNum, String title, String caption, String email, String id) {
//        this.college = college;
//        this.major = major;
//        this.course = course;
//        this.chapterNum = chapterNum;
//        this.title = title;
//        this.caption = caption;
//        this.email = email;
//        this.id = id;
//        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
//        Date dateobj = new Date();
//        date = df.format(dateobj);
//    }
//نتغلللل

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public  String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public  String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public  String getChapterNum() {
        return chapterNum;
    }

    public void setChapterNum(String chapterNum) {
        this.chapterNum = chapterNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



}
