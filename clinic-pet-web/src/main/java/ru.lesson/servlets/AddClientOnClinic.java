package ru.lesson.servlets;

import GenClinic.GenClient;
import GenClinic.GenPet;
import ru.lesson.lessons.Client;
import ru.lesson.lessons.Clinic;
import ru.lesson.lessons.Dog;
import ru.lesson.lessons.Pet;
import ru.lesson.store.ClinicCash;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AddClientOnClinic extends HttpServlet {

   final AtomicInteger ids = new AtomicInteger();
   private final ClinicCash CLINIC_CASH = ClinicCash.getClinic();


   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

   CLINIC_CASH.add(new Client(this.ids.incrementAndGet(), req.getParameter("name"), new Pet(req.getParameter("petName"))));
   resp.sendRedirect(String.format("%s%s",req.getContextPath(),"/user/view"));
   }
}
