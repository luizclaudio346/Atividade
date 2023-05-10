package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Hospede extends Usuario {
    private List<Propriedade> propriedadesFavoritas;

    public Hospede(String nome, String email, String telefone) {
        super(nome, email, telefone);
        this.propriedadesFavoritas = new ArrayList<>();
    }

    public List<Propriedade> getPropriedadesFavoritas() {
        return propriedadesFavoritas;
    }

    public void setPropriedadesFavoritas(List<Propriedade> propriedadesFavoritas) {
        this.propriedadesFavoritas = propriedadesFavoritas;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Hóspede: " + getNome() + ", E-mail: " + getEmail() + ", Número de propriedades favoritas: " + propriedadesFavoritas.size());
    }
}