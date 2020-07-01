package com.test.votingservice.repository;

import com.test.votingservice.model.VoteCount;

public interface VotingRepository {

    // to capture casting of vote
    String submitVote(String candidateName);

    // get winner of election

    VoteCount getWinner();

}
