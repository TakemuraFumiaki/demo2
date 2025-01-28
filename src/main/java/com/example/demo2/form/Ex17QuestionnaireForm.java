package com.example.demo2.form;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Ex17QuestionnaireForm {
    @NotBlank(message = "値を入力してください")
    @Size(min = 1,max =127, message="1文字以上127文字以内で記載してください")
    private String name;

    @Size(min = 1,max =127, message="1文字以上127文字以内で記載してください")
    private String email;

    @NotBlank(message = "値を入力してください")
    private String gender;

    @NotEmpty(message = "趣味一つ以上選択してください")
    private List<Integer> hobbyList;


    private String language;

    @Size(min = 1 ,max = 2000 ,message = "1文字以上1000文字以内で入力してください")
    private String comment;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public List<Integer> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<Integer> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    

}
