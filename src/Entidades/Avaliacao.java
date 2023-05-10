package Entidades;

import Entidades.Hospede;
import Entidades.Propriedade;

public class Avaliacao {
    private Propriedade propriedadeAvaliada;
    private Hospede hospedeAvaliador;
    private int nota;
    private String comentario;

    public Avaliacao(Propriedade propriedadeAvaliada, Hospede hospedeAvaliador, int nota, String comentario) {
        this.propriedadeAvaliada = propriedadeAvaliada;
        this.hospedeAvaliador = hospedeAvaliador;
        this.nota = nota;
        this.comentario = comentario;
    }

    // Métodos Get e Set para os atributos
    public Propriedade getPropriedadeAvaliada() {
        return propriedadeAvaliada;
    }

    public void setPropriedadeAvaliada(Propriedade propriedadeAvaliada) {
        this.propriedadeAvaliada = propriedadeAvaliada;
    }

    public Hospede getHospedeAvaliador() {
        return hospedeAvaliador;
    }

    public void setHospedeAvaliador(Hospede hospedeAvaliador) {
        this.hospedeAvaliador = hospedeAvaliador;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}

