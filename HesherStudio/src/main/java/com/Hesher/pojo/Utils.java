package com.Hesher.pojo;

public class Utils {
    public static boolean strIsNull(String str){
        if (str != null && !str.trim().equals("")) {
            return false;
        }else{
            return true;
        }
    }
}
