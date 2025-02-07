package com.gm.test;

import com.gm.dao.*;

import java.util.List;

public class TestDaos {
    public static void main(String[] args) {
        AddressDao addressDao = new AddressDao();
        System.out.println("Addresses: ");
        print(addressDao.listAddresses());

        AssignmentDao assignmentDao = new AssignmentDao();
        System.out.println("Assignments: ");
        print(assignmentDao.listAssignments());

        ContactDao contactDao = new ContactDao();
        System.out.println("Contacts: ");
        print(contactDao.listContacts());

        CourseDao courseDao = new CourseDao();
        System.out.println("Courses: ");
        print(courseDao.listCourses());

        StudentDao studentDao = new StudentDao();
        System.out.println("Students: ");
        print(studentDao.listStudents());
    }

    public static void print(List collection) {
        for (Object object : collection) {
            System.out.println("Value" + object);
        }
    }
}
