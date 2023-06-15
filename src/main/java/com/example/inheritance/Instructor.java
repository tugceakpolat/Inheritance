package com.example.inheritance;

public class Instructor extends Academician{

    private int doorNumber;

    public Instructor(String nameSurname, String phoneNumber, String eMail, String department, String title, int doorNumber) {
        super(nameSurname, phoneNumber, eMail, department, title);
        this.setDoorNumber(doorNumber);
    }

    public void senateMeeting(){

    }

    public void madeQuiz(){

    }

    @Override
    public void checkIn() {
        System.out.println(this.getNameSurname() + " check in completed.");
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public void takeTheClass() {
        System.out.println(getNameSurname() + "enter the class.");
    }
}
