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

    public Assignment findAssignmentById(Assignment assignment) {
        return this.assignmentDao.findAssignmentById(assignment);
    }

    public void saveAssignment(Assignment assignment) {
        if (assignment != null && assignment.getIdAssignment() == null)
            assignmentDao.insert(assignment);
        else
            assignmentDao.update(assignment);
    }

    public void deleteAssignment(Assignment assignment) {
        assignmentDao.delete(assignment);
    }
}
