package ru.lesson.servlets;


import org.junit.Test;

import org.mockito.Mockito;
import ru.lesson.store.ClinicCash;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.junit.Assert.*;


public class TestAddClientOnClinicTest extends Mockito {


    final ClinicCash clinicCash = ClinicCash.getClinic();

    @Test
    public void createUser() throws ServletException, IOException {

      /*  HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        when(request.getParameter("Cname")).thenReturn("test");
        when(request.getParameter("petName")).thenReturn("test");

        assertTrue(clinicCash.values().isEmpty());

        new AddClientOnClinic().doPost(request, response);

        verify(request, atLeast(1)).getParameter("Cname");
        verify(request, atLeast(1)).getParameter("petName");
        assertFalse(clinicCash.values().isEmpty());

        //clinicCash.delete(clinicCash.findByName("test").getId());*/
    }
}
