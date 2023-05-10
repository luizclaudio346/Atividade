package Entidades;

public class Apartamento extends Propriedade {
    private int numAndar;
    private boolean temVaranda;

    public Apartamento(String endereco, int numQuartos, double preco, int numAndar, boolean temVaranda) {
        super(endereco, numQuartos, preco);
        this.numAndar = numAndar;
        this.temVaranda = temVaranda;
    }

    public int getNumAndar() {
        return numAndar;
    }

    public void setNumAndar(int numAndar) {
        this.numAndar = numAndar;
    }

    public boolean isTemVaranda() {
        return temVaranda;
    }

    public void setTemVaranda(boolean temVaranda) {
        this.temVaranda = temVaranda;
    }
}