package com.example.inheritance;

public class Security extends Officer{

    private String document;
    public Security(String nameSurname, String phoneNumber, String eMail, String department, String shift, String document) {
        super(nameSurname, phoneNumber, eMail, department, shift);
        this.setDocument(document);
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
