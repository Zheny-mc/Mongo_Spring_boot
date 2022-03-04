package com.codewithkris.Service;

import com.codewithkris.DAO.ProjectDAO;
import com.codewithkris.Entity.Project;
import com.codewithkris.Entity.ProjectUpdatePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ProjectService {
    @Autowired
    private ProjectDAO projectDAO;

    public Collection<Project> getProject() {
        return projectDAO.getProject();
    }

    public Project createProject(Project project) {
        return projectDAO.createProject(project);
    }

    public Optional<Project> getProjectById(int id) {
        return projectDAO.getProjectById(id);
    }

    public Optional<Project> deleteProjectById(int id) {
        return projectDAO.deleteProjectById(id);
    }

    public Optional<Project> updateProjectById(int id, ProjectUpdatePayload projectUpdatePayload) {
        return projectDAO.updateProjectById(id, projectUpdatePayload);
    }
}
