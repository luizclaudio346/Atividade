package Entidades;

import java.util.ArrayList;

public abstract class Propriedade {
    private String endereco;
    private int numeroQuartos;
    private double preco;
    private ArrayList<Reserva> reservas;
    private ArrayList<Avaliacao> avaliacoes;

    public Propriedade(String endereco, int numeroQuartos, double preco) {
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
        this.preco = preco;
        this.reservas = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    // Métodos get e set para os atributos

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    public double getAvaliacaoMedia() {
        double media = 0.0;
        int totalAvaliacoes = 0;

        for (Avaliacao avaliacao : avaliacoes) {
            media += avaliacao.getNota();
            totalAvaliacoes++;
        }

        if (totalAvaliacoes > 0) {
            media /= totalAvaliacoes;
        }

        return media;
    }
}

