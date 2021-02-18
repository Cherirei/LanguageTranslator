package com.example.linear;

import android.graphics.drawable.Drawable;

public class Words {
    private int image;
    private String english_word;
    private String kalenjin_word;

    public Words(String kalenjin_word,String english_word,int image) {
        this.english_word = english_word;
        this.kalenjin_word = kalenjin_word;
       this.image= image;   }

    public Drawable getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getEnglish_word() {
        return english_word;
    }

    public void setEnglish_word(String english_word) {
        this.english_word = english_word;
    }

    public String getKalenjin_word() {
        return kalenjin_word;
    }

    public void setKalenjin_word(String kalenjin_word) {
        this.kalenjin_word = kalenjin_word;
    }
}