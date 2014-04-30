package edu.yale.library.entity.model;

import java.util.Date;

public class UserProjectBuilder {
    private Date date;
    private int userId;
    private int projectId;
    private String role;

    public UserProjectBuilder setDate(Date date) {
        this.date = date;
        return this;
    }

    public UserProjectBuilder setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public UserProjectBuilder setProjectId(int projectId) {
        this.projectId = projectId;
        return this;
    }

    public UserProjectBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    public UserProject createUserProject() {
        return new UserProject(date, userId, projectId, role);
    }
}