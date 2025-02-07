package com.gm.service;

import com.gm.dao.AssignmentDao;
import com.gm.domain.Assignment;

import java.util.List;

public class AssignmentService {
    private AssignmentDao assignmentDao;

    public AssignmentService() {
        this.assignmentDao = new AssignmentDao();
    }

    public List<Assignment> listAssignments() {
        return this.assignmentDao.listAssignments();
    }
}
