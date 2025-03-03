package DAO;

import db.DbConnect;
import model.Cantor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CantorDAO {

    Connection connection;

    public CantorDAO()throws ClassNotFoundException, SQLException{
        connection = DbConnect.getConnection();
    }

    public void addCantor(Cantor cantor) throws SQLException{
        try{
            PreparedStatement pst = connection.prepareStatement("insert into cantor(nome, estiloMusical, qtdAlbum) values(?,?,?)");
            pst.setString(1, cantor.getNome());
            pst.setString(2, cantor.getEstiloMusical());
            pst.setString(3, cantor.getQtdAlbum());

            pst.execute();

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public List<Cantor> getAllCantor() throws SQLException{
        List<Cantor> cantores = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from cantor");

            while(rs.next()){
                Cantor cantor = new Cantor(
                        rs.getString("qtdAlbum"),
                        rs.getString("estiloMusical"),
                        rs.getString("nome"));

                cantores.add(cantor);

            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return cantores;
    }

}
