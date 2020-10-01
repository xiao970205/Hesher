package com.Hesher.pojo;

import java.io.Serializable;

public class VideoShow implements Serializable {
    private String id;

    private String videoUrl;

    private String videoTittle1;

    private String videoTittle2;

    private Integer videoX;

    private Integer videoY;

    private String color;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoTittle1() {
        return videoTittle1;
    }

    public void setVideoTittle1(String videoTittle1) {
        this.videoTittle1 = videoTittle1;
    }

    public String getVideoTittle2() {
        return videoTittle2;
    }

    public void setVideoTittle2(String videoTittle2) {
        this.videoTittle2 = videoTittle2;
    }

    public Integer getVideoX() {
        return videoX;
    }

    public void setVideoX(Integer videoX) {
        this.videoX = videoX;
    }

    public Integer getVideoY() {
        return videoY;
    }

    public void setVideoY(Integer videoY) {
        this.videoY = videoY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}