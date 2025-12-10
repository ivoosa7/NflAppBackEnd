package com.nfl.seasonproject.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nfl.seasonproject.entities.Team;

@Repository
public interface TeamRepository extends MongoRepository <Team, String>{
    
}
