package com.example.myapplication;
public class Plan {
    public String title;
    public Boolean isChecked;

    public Plan(String title, Boolean isChecked) {
        this.title = title;
        this.isChecked = isChecked;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getChecked() {
        return isChecked;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setChecked(Boolean checked) {
        isChecked = checked;
    }
}