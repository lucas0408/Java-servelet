package com.exemplo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class CriaCantorServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String nome = request.getParameter("name");
        String estiloMusical = request.getParameter("estiloMusical");
        String qtdAlbum = request.getParameter("qtdAlbum");

        System.out.println(nome);
        System.out.println(estiloMusical);
        System.out.println(qtdAlbum);

    }
}
