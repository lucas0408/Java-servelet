package web;

import DAO.CantorDAO;
import model.Cantor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;

public class CantorServelet extends HttpServlet {

    private static final long serialVersionUID = 1l;

    private CantorDAO dao;

    public CantorServelet() throws ClassNotFoundException, SQLException {
        super();
        this.dao = new CantorDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("served at:").append(request.getContextPath());
        RequestDispatcher index = request.getRequestDispatcher("index.jsp");
        try {
            request.setAttribute("cantores", dao.getAllCantor());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        index.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cantor cantor = new Cantor(
                request.getParameter("qtdAlbum"), request.getParameter("estiloMusical"),
                request.getParameter("nome"));

        try {
            dao.addCantor(cantor);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
