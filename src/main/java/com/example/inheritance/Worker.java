package com.example.inheritance;

public class Worker {
    private String nameSurname;
    private String phoneNumber;
    private String eMail;

    public Worker(String nameSurname, String phoneNumber,String eMail){
        this.seteMail(eMail);
        this.setNameSurname(nameSurname);
        this.setPhoneNumber(phoneNumber);

    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    //giriş,çıkış,yemekhane

    public void checkIn(){
        System.out.println(this.getNameSurname() + " logged in.");
    }

    public void checkOut(){
        System.out.println(this.getNameSurname() + " logged out.");
    }

    public void diningHall(){
        System.out.println(this.getNameSurname() + " entered the dining hall.");
    }

    public static void entrants(Worker[] login){
        for(Worker workers : login){
            workers.checkIn();
        }
    }


}
