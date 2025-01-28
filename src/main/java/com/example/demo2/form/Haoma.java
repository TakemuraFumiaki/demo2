package com.example.demo2.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class Haoma {
    
    @Positive(message = "数値を入力してください")
    @NotNull(message = "正の整数を入力してください")
    private String left;
    
    @Positive(message = "数値を入力してください")
    @NotNull(message = "正の整数を入力してください")
    private String right;

    private int calc;
    
    public String getLeft() {
        return left;
    }
    public void setLeft(String left) {
        this.left = left;
    }
    public String getRight() {
        return right;
    }
    public void setRight(String right) {
        this.right = right;
    }
    public int getCalc() {
        return calc;
    }
    public void setCalc(int calc) {
        this.calc = calc;
    }

    
    
    



}
