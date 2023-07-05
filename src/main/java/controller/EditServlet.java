package controller;

import model.Student;
import service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/edit")
public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Student student = StudentService.findStudentById(id);
        req.setAttribute("student", student);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Edit.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        LocalDate dateOfBirth = LocalDate.parse(req.getParameter("email"));
        String address = req.getParameter("dateofBirth");
        String phone = req.getParameter("address");
        String email = req.getParameter("phone");
        int classroom = Integer.parseInt(req.getParameter("classroom"));
        StudentService.edit(new Student(id,name,email,dateOfBirth,address,phone,classroom));
        resp.sendRedirect("/showList");
    }
    }

