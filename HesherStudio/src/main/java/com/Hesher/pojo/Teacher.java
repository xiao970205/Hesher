package com.Hesher.pojo;

import java.io.Serializable;

public class Teacher implements Serializable {
    private String id;

    private String name;

    private Integer sex;

    private String phone;

    private String teacherinfo;

    private String teachershortinfo;

    private Integer ranking;

    private String pic1;

    private String pic2;

    private String pic3;

    private String pic4;

    private String pic5;

    private Integer indexRange;

    private Integer indexShow;

    private String instrument;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTeacherinfo() {
        return teacherinfo;
    }

    public void setTeacherinfo(String teacherinfo) {
        this.teacherinfo = teacherinfo;
    }

    public String getTeachershortinfo() {
        return teachershortinfo;
    }

    public void setTeachershortinfo(String teachershortinfo) {
        this.teachershortinfo = teachershortinfo;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    public String getPic4() {
        return pic4;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4;
    }

    public String getPic5() {
        return pic5;
    }

    public void setPic5(String pic5) {
        this.pic5 = pic5;
    }

    public Integer getIndexRange() {
        return indexRange;
    }

    public void setIndexRange(Integer indexRange) {
        this.indexRange = indexRange;
    }

    public Integer getIndexShow() {
        return indexShow;
    }

    public void setIndexShow(Integer indexShow) {
        this.indexShow = indexShow;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}