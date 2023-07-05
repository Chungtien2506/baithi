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

@WebServlet(urlPatterns = "/createStudent")
public class CreateStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Create.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        LocalDate DateofBirth = LocalDate.parse(req.getParameter("DateofBirth"));
        String address = req.getParameter("address");
        String phoneNumber = req.getParameter("phone");
        int classroom = Integer.parseInt(req.getParameter("classroom"));
        StudentService.save(new Student(name,email,DateofBirth,address,phoneNumber,classroom));
        resp.sendRedirect("/showList");
    }
    }

