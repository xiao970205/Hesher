package com.Hesher.pojo;

public class Utils {
    public static boolean strIsNull(String str){
        if (str != null && !"".equals(str.trim())) {
            return false;
        }else{
            return true;
        }
    }
}
