package com.test.votingservice.model;

public class VoteCount {

    private String fullName;
    private int totalVotes;

    public VoteCount() {
    }

    public VoteCount(String fullName, int totalVotes) {
        this.fullName = fullName;
        this.totalVotes = totalVotes;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }
}
