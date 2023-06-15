package com.example.inheritance;

public abstract class Academician extends Worker{
    //bölüm ünvan - derse gir
    private String department;
    private String title;

    public Academician(String nameSurname, String phoneNumber, String eMail, String department, String title) {
        super(nameSurname, phoneNumber, eMail);
        this.setDepartment(department);
        this.setTitle(title);
    }

    public abstract void takeTheClass ();

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
