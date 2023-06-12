package com.example.inheritance;

public class Officer extends Worker{

    private String department;
   private String shift;

    public Officer(String nameSurname, String phoneNumber, String eMail, String department, String shift) {
        super(nameSurname, phoneNumber, eMail);
        this.setDepartment(department);
        this.setShift(shift);
    }

    public void shift(){
        System.out.println(this.getNameSurname() + "'s working hours : 09:00-18:00");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
