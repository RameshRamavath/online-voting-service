package com.test.votingservice.repository;

import com.test.votingservice.model.Candidate;


import java.util.List;


public interface CandidateRepository {
    Candidate findByName (String fullName);
    List<Candidate> allCandidates();
    Candidate findByConstituency (String constituency);
    String addCandidate (Candidate candidate);
}
