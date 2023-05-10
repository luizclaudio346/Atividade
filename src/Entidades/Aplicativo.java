package Entidades;

import java.util.ArrayList;

public class Aplicativo {
    public static void main(String[] args) {
        // Criando objetos Propriedade
        Apartamento apartamento1 = new Apartamento("Rua A, 123", 2, 150.0, 4, true);
        Casa casa1 = new Casa("Rua B, 456", 3, 300.0, 6, true);
        QuartoDeHotel quarto1 = new QuartoDeHotel("Rua C, 789", 1, 100.0, 2, false);

        // Criando objetos Hóspede
        Hospede hospede1 = new Hospede("João", "joao@gmail.com", "123456789");
        Hospede hospede2 = new Hospede("Maria", "maria@gmail.com", "987654321");

        // Criando objetos Reserva
        Reserva reserva1 = new Reserva(apartamento1, hospede1, "2023-05-10", "2023-05-15", 750.0);
        Reserva reserva2 = new Reserva(casa1, hospede1, "2023-06-01", "2023-06-05", 1500.0);
        Reserva reserva3 = new Reserva(quarto1, hospede2, "2023-07-10", "2023-07-15", 500.0);

        // Adicionando reservas às propriedades
        apartamento1.adicionarReserva(reserva1);
        casa1.adicionarReserva(reserva2);
        quarto1.adicionarReserva(reserva3);

        // Criando objetos Avaliação
        Avaliacao avaliacao1 = new Avaliacao(apartamento1, hospede1, 4, "Ótima localização");
        Avaliacao avaliacao2 = new Avaliacao(casa1, hospede2, 5, "Casa espaçosa e bem equipada");

        // Adicionando avaliações às propriedades
        apartamento1.adicionarAvaliacao(avaliacao1);
        casa1.adicionarAvaliacao(avaliacao2);

        // Imprimindo informações das propriedades
        System.out.println("Informações do apartamento:");
        System.out.println(apartamento1.toString());
        System.out.println("Avaliação média: " + apartamento1.getAvaliacaoMedia());

        System.out.println("\nInformações da casa:");
        System.out.println(casa1.toString());
        System.out.println("Avaliação média: " + casa1.getAvaliacaoMedia());

        System.out.println("\nInformações do quarto de hotel:");
        System.out.println(quarto1.toString());
        System.out.println("Avaliação média: " + quarto1.getAvaliacaoMedia());
    }
}
