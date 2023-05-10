package Entidades;

import java.time.LocalDate;

public class Reserva {
    private Propriedade propriedade;
    private Hospede hospede;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double precoTotal;

    public Reserva(Propriedade propriedade, Hospede hospede, LocalDate checkIn, LocalDate checkOut, double precoTotal) {
        this.propriedade = propriedade;
        this.hospede = hospede;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.precoTotal = precoTotal;
    }

    public Reserva(Casa casa1, Hospede hospede1, String date, String date1, double precoTotal) {
    }

    // Métodos get e set para os atributos

    public Propriedade getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(Propriedade propriedade) {
        this.propriedade = propriedade;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
}