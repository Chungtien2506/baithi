package service;

import dao.StudentDAO;
import model.Student;

import java.util.List;

public class StudentService {
    public static List<Student> getAllStudents() {
        return StudentDAO.getAllStudents();
    }

    public static Student findStudentById(int id) {
        return StudentDAO.findStudentById(id);
    }

    public static boolean edit(Student student) {
        return StudentDAO.edit(student);
    }

    public static void deleteStudent(int id) {
        StudentDAO.deleteStudent(id);
    }

    public static boolean save(Student student) {
        return StudentDAO.save(student);
    }

    public static List<Student> search(String str) {
        return StudentDAO.search(str);
    }

}
