package dao;

import model.Student;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    static Connection connection = ConnectionMySql.getConnection();

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "select * from hocvien";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                LocalDate dateOfBirth = LocalDate.parse(resultSet.getString("dateofBirth"));
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phonenumber");
                int classroom = Integer.parseInt(resultSet.getString("idclass"));
                students.add(new Student(id, name,email, dateOfBirth, address, phone, classroom));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static boolean edit(Student student) {
        String sql = "update hocvien set name=?, email=?, dateofBirth=?, address=?, phone=?, classroom=? where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(7, student.getId());
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, String.valueOf(student.getEmail()));
            preparedStatement.setDate(3, Date.valueOf(student.getDateofBirth()));
            preparedStatement.setString(4, student.getAddress());
            preparedStatement.setString(5, student.getPhoneNumber());
            preparedStatement.setInt(6, student.getClassroom());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Student findStudentById(int id) {
        String sql = "select * from hocvien where id=" + id;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            LocalDate dateofBirth = LocalDate.parse(resultSet.getString("dateofBirth"));
            String address = resultSet.getString("address");
            String phone = resultSet.getString("phone");
            int classroom = Integer.parseInt(resultSet.getString("idclass"));
            return new Student(id, name, email, dateofBirth, address, phone, classroom);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void deleteStudent(int id) {
        String sql = "Delete from hocvien where id=" + id;
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean save(Student student) {
        String sql = "INSERT INTO hocvien (name, email, dateofbirth, address, phonenumber, idclass) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, String.valueOf(student.getEmail()));
            preparedStatement.setDate(3, Date.valueOf(student.getDateofBirth()));
            preparedStatement.setString(4, student.getAddress());
            preparedStatement.setString(5, student.getPhoneNumber());
            preparedStatement.setInt(6, student.getClassroom());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public static List<Student> search(String str) {
        List<Student> resultSearchs = new ArrayList<>();
        String sql = "SELECT * FROM hocvien WHERE name LIKE ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + str + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("phonenumber");
                LocalDate dateofBirth = resultSet.getDate("dateofbirth").toLocalDate();
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phonenumber");
                int classroom = resultSet.getInt("idclass");
                resultSearchs.add(new Student(id, name, email, dateofBirth, address, phone, classroom));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSearchs;
    }

}
