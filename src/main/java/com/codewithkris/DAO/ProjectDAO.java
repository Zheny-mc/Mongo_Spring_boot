package com.codewithkris.DAO;

import com.codewithkris.Entity.Project;
import com.codewithkris.Entity.ProjectUpdatePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

@Component
public class ProjectDAO {
    @Autowired
    private ProjectRepository repository;

	public Collection<Project> getProject() {
        return repository.findAll();
    }

    public Project createProject(Project project) {
        return repository.insert(project);
    }

    public Optional<Project> getProjectById(int id) {
        return repository.findById(id);
    }

    public Optional<Project> deleteProjectById(int id) {
         Optional<Project> book = repository.findById(id);
         book.ifPresent(b -> repository.delete(b));
         return book;
    }

    public Optional<Project> updateProjectById(int id, ProjectUpdatePayload projectUpdatePayload) {
        Optional<Project> book = repository.findById(id);
        book.ifPresent(b -> b.setName(projectUpdatePayload.getName()));
        book.ifPresent(b -> repository.save(b));
        return book;
    }
}
