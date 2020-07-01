package com.test.votingservice.repository;

import com.test.votingservice.model.Voter;

import java.util.List;

public interface VoterRepository {

    Voter findByName(String fullName);
    Voter findByEmail (String email);
    Voter findByVoterId (String voterID);

}
