package com.test.votingservice.controller;

import com.test.votingservice.model.Candidate;
import com.test.votingservice.model.VoteCount;
import com.test.votingservice.model.Voter;
import com.test.votingservice.repository.CandidateRepository;
import com.test.votingservice.repository.VoterRepository;
import com.test.votingservice.repository.VotingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController()
@RequestMapping(path = "/election")

public class VotingController {


    private CandidateRepository candidateRepository;
    private VoterRepository voterRepository;
    private VotingRepository votingRepository;

    @Autowired
    public VotingController(CandidateRepository candidateRepository, VoterRepository voterRepository, VotingRepository votingRepository) {
        this.candidateRepository = candidateRepository;
        this.voterRepository = voterRepository;
        this.votingRepository = votingRepository;
    }



    @GetMapping(path = "/candidates")

    public List<Candidate> getContestants (){
       return candidateRepository.allCandidates();
    }

    @GetMapping(path = "/candidate/byName/{name}")
    public Candidate getContestants (@PathVariable("name") final String name){
        return candidateRepository.findByName(name);
    }

    @GetMapping(path = "/candidate/byConstituency/{constituency}")
    public Candidate findByConstituency(@PathVariable("constituency") final String constituency){
        return candidateRepository.findByConstituency(constituency);
    }
    // create new candidate

    @PostMapping(path = "/create/candidate")
    public String addCandidate(@RequestBody Candidate request){
        return candidateRepository.addCandidate(request);
    }


    @GetMapping(path = "/voter/byName/{name}")
    public Voter getVoterByName (@PathVariable("name") final String fullName){
        return voterRepository.findByName(fullName);
    }

    @GetMapping(path = "/voter/byEmail/{email}")
    public Voter getVoterByEmail (@PathVariable("email") final String email){
        return voterRepository.findByEmail(email);
    }

    @GetMapping(path = "/voter/byVoterId/{voterId}")
    public Voter getVoterById (@PathVariable("voterId") final String voterId){
        return voterRepository.findByVoterId(voterId);
    }

    @PutMapping(path = "/voting/{candidate}")
    public String castVote(@PathVariable("candidate") String candidateName){
        return votingRepository.submitVote(candidateName);
    }

    @GetMapping(path = "/result")
    public VoteCount getWinner (){
        return votingRepository.getWinner();
    }
}


