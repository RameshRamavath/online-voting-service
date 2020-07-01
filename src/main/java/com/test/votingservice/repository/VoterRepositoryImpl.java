package com.test.votingservice.repository;


import com.test.votingservice.model.Candidate;
import com.test.votingservice.model.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class VoterRepositoryImpl implements VoterRepository {

    // Inject JDBC template to run queries

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Voter findByName(String fullName) {
        String query = "select * from voters WHERE fullName = ?";
        Voter result = jdbcTemplate.queryForObject(query,new Object[]{fullName}, new BeanPropertyRowMapper<>(Voter.class));
        return result;
    }

    @Override
    public Voter findByEmail(String email) {
        String query = "select * from voters WHERE email = ?";
        Voter result = jdbcTemplate.queryForObject(query,new Object[]{email}, new BeanPropertyRowMapper<>(Voter.class));
        return result;
    }

    public Voter findByVoterId(String voterID) {
        String query = "select * from voters WHERE voterID = ?";
        Voter result = jdbcTemplate.queryForObject(query,new Object[]{voterID}, new BeanPropertyRowMapper<>(Voter.class));
        return result;
    }

}
