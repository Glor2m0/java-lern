package ru.lesson.servlets;

import ru.lesson.lessons.Client;
import ru.lesson.lessons.Pet;
import ru.lesson.store.ClinicCash;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class AddClientOnClinic extends HttpServlet {

   final AtomicInteger idl = new AtomicInteger();
   private final ClinicCash CLINIC_CASH = ClinicCash.getClinic();


   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

   CLINIC_CASH.add(new Client(this.idl.incrementAndGet(), req.getParameter("Cname"), new Pet(req.getParameter("petName"))));
   resp.sendRedirect(String.format("%s%s",req.getContextPath(),"/user/allClients"));
   }
}
