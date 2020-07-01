package com.test.votingservice.repository;

import com.test.votingservice.model.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CandidateRepositoryImpl implements CandidateRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Candidate> allCandidates() {

        List<Candidate> contestants = new ArrayList<>();

        // select everything from candidates tables
        String query = "select fullName,politicalParty,constituency from candidates";
        contestants.addAll(jdbcTemplate.query(query, new BeanPropertyRowMapper<Candidate>(Candidate.class)));
        return contestants;
    }

    @Override
    public Candidate findByName(String fullName) {

        String query = "select * from candidates WHERE fullName = ?";
        Candidate result = jdbcTemplate.queryForObject(query,new Object[]{fullName}, new BeanPropertyRowMapper<>(Candidate.class));
        return result;
    }


    @Override
    public Candidate findByConstituency(String constituency) {
        // select everything from candidates tables
        String query = "select * from candidates WHERE constituency = ?";
        Candidate result = jdbcTemplate.queryForObject(query,new Object[]{constituency}, new BeanPropertyRowMapper<>(Candidate.class));
        return result;
    }

    @Override

    public String addCandidate(Candidate candidate){
        // insert query

        final String query =  "INSERT INTO candidates (fullName, politicalParty, constituency)  VALUES (?, ?, ?)";

        // define query arguments
        Object[] params = new Object[]{candidate.getFullName(), candidate.getPoliticalParty(), candidate.getConstituency()};
        int[] types = new int[] { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR};

        int rowCount = jdbcTemplate.update(query, params, types);
        if(rowCount>0){
            return "Candidate created";
        }
        return "Failed to create candidate";
    }

}
