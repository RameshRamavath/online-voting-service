package com.test.votingservice.model;


public class Voter {

    private String fullName;
    private String voterId;
    private String email;

    public Voter(String fullName, String voterId, String email) {
        this.fullName = fullName;
        this.voterId = voterId;
        this.email = email;
    }

    public Voter() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
