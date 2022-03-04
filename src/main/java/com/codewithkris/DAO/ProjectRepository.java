package com.codewithkris.DAO;

import com.codewithkris.Entity.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, Integer> {

}
