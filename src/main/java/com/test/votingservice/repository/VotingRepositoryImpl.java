package com.test.votingservice.repository;


import com.test.votingservice.model.Candidate;
import com.test.votingservice.model.VoteCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;

@Repository
public class VotingRepositoryImpl implements VotingRepository {


    @Autowired
    JdbcTemplate jdbcTemplate;

    // to capture casting of vote

    @Override
    public String submitVote(String candidateName){

        String query = "UPDATE election.candidates SET totalVotes = totalVotes+1 WHERE fullName = ?";
        int rowCount = jdbcTemplate.update(query, new Object[]{candidateName});
        if(rowCount>0){
            return "CASTING VOTE SUCCESSFUL";
        }
        return "UNSUCCESSFUL TRY AGAIN!!";
    }

    // get winner of election

    @Override
    public VoteCount getWinner(){
        String query = "select fullName,totalVotes  from election.candidates where totalVotes = (select max(totalVotes)  from election.candidates)";
        VoteCount result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(VoteCount.class));
        return result;
    }

}
