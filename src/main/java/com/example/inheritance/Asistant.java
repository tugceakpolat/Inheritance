package com.example.inheritance;

public class Asistant extends Academician{

    private String officeHour;
    public Asistant(String nameSurname, String phoneNumber, String eMail, String department, String title, String officeHour) {
        super(nameSurname, phoneNumber, eMail, department, title);
        this.setOfficeHour(officeHour);
    }

    public void madeQuiz (){

    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    @Override
    public void takeTheClass() {
        System.out.println(getNameSurname() + " enter the class.");
    }
}
