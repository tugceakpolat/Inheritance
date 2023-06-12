package com.example.inheritance;

public class Computing extends Officer{

    String mission;
    public Computing(String nameSurname, String phoneNumber, String eMail, String department, String shift,String mission) {
        super(nameSurname, phoneNumber, eMail, department, shift);
        this.mission = mission;
    }

    public void setNetwork(){

    }
}
