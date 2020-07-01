package com.test.votingservice.model;



public class Candidate {

    private String fullName;
    private String politicalParty;
    private String constituency;

    public Candidate() {
    }

    public Candidate(String fullName, String politicalParty, String constituency) {
        this.fullName = fullName;
        this.politicalParty = politicalParty;
        this.constituency = constituency;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }
}
