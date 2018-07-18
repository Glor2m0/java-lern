package ru.lesson.servlets;


import ru.lesson.store.ClinicCash;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserPetShowServlet extends HttpServlet {
private final ClinicCash CLINIC_CASH = ClinicCash.getClinic();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("clients", this.CLINIC_CASH.values());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/user/ClientsView.jsp");
        dispatcher.forward(req,resp);
    }
}
