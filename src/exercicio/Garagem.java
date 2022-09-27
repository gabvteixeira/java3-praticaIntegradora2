package exercicio;

import java.util.ArrayList;

public class Garagem {
    private int id;
    ArrayList<Veiculo> veiculos;

    public Garagem(int id, ArrayList<Veiculo> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
