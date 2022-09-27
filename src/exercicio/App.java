package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Veiculo("Ford", "Fiesta", 1000));
        veiculos.add(new Veiculo("Ford", "Focus", 1200));
        veiculos.add(new Veiculo("Ford", "Explorer", 2500));
        veiculos.add(new Veiculo("Fiat", "Uno", 500));
        veiculos.add(new Veiculo("Fiat", "Cronos", 1000));
        veiculos.add(new Veiculo("Fiat", "Torino", 1250));
        veiculos.add(new Veiculo("Chevrolet", "Aveo", 1250));
        veiculos.add(new Veiculo("Chevrolet", "Spin", 2500));
        veiculos.add(new Veiculo("Toyota", "Corola", 1200));
        veiculos.add(new Veiculo("Toyota", "Fortuner", 3000));
        veiculos.add(new Veiculo("Renault", "Logan", 950));


        System.out.println("======== VEICULOS ANTES DE ORDENAR POR PRECO ==========");
        veiculos.forEach(System.out::println);
        System.out.println("======== VEICULOS ORDENADOS POR PRECO ==========");
        List<Veiculo> sortedVeiculos = veiculos.stream().
                sorted(Comparator.comparingDouble(Veiculo::getPreco)).collect(Collectors.toList());
        sortedVeiculos.forEach(System.out::println);

        System.out.println("======== VEICULOS ORDENADOS POR MARCA ==========");
        List<Veiculo> sortedVeiculosMarca = veiculos.stream().
                sorted(Comparator.comparing(Veiculo::getMarca)).collect(Collectors.toList());
        sortedVeiculosMarca.forEach(System.out::println);

        System.out.println("======== VEICULOS FILTRADOS POR PRECO MENOR QUE 1000==========");
        List<Veiculo> filteredVeiculos1 = veiculos.stream().
                filter(v -> v.getPreco() < 1000).collect(Collectors.toList());
        filteredVeiculos1.forEach(System.out::println);
        System.out.println("======== VEICULOS FILTRADOS POR PRECO MAIOR OU IGUAL QUE 1000==========");
        List<Veiculo> filteredVeiculos2 = veiculos.stream().
                filter(v -> v.getPreco() >= 1000).collect(Collectors.toList());
        filteredVeiculos2.forEach(System.out::println);

        System.out.println("======== MEDIA DE PRECO DA LISTA==========");
        double media = (veiculos.stream().map(Veiculo::getPreco)
                .reduce(0.0, Double::sum)) / veiculos.size();
        System.out.println("Media de preco: " + media);

        Garagem garagem = new Garagem(1, veiculos);
    }
}
