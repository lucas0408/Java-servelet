package model;

import java.util.UUID;

public class Cantor {
    private String ID;
    private String nome;
    private String estiloMusical;
    private String qtdAlbum;

    public Cantor(String qtdAlbum, String estiloMusical, String nome) {
        this.qtdAlbum = qtdAlbum;
        this.estiloMusical = estiloMusical;
        this.nome = nome;
        this.ID = UUID.randomUUID().toString();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public String getQtdAlbum() {
        return qtdAlbum;
    }

    public void setQtdAlbum(String qtdAlbum) {
        this.qtdAlbum = qtdAlbum;
    }
}
