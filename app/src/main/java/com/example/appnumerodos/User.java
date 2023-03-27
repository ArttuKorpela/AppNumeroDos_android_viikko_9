package com.example.appnumerodos;

public class User {
    private String firsName = "Arttu";
    private String lastName = "Korpela";
    private String email = "testi@email.com";
    private String degreeProgram = "TITE";
    private int image;


    public User(String firsName, String lastName, String email, String degreeProgram, int image) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.image = image;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getImage() {
        return image;
    }


}
