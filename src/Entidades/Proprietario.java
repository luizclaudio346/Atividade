package Entidades;

public class Proprietario extends Usuario {
    private int numPropriedades;

    public Proprietario(String nome, String email, String telefone, int numPropriedades) {
        super(nome, email, telefone);
        this.numPropriedades = numPropriedades;
    }

    public int getNumPropriedades() {
        return numPropriedades;
    }

    public void setNumPropriedades(int numPropriedades) {
        this.numPropriedades = numPropriedades;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Proprietário: " + getNome() + ", E-mail: " + getEmail() + ", Número de propriedades: " + numPropriedades);
    }
}
