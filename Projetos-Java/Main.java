package jjj;
public class Main {
    public static void main(String[] args) {

        // Array de Veiculos para armazenar diferentes tipos de objetos
        Veiculo[] lista = new Veiculo[3];

        // Criando objetos de exemplo
        lista[0] = new Veiculo("ABC-1234", 2010);
        lista[1] = new Caminhao("TRK-2024", 2022, 6);
        lista[2] = new Onibus("BUS-8080", 2018, 50);

        // Exibindo os dados no console
        for (Veiculo v : lista) {
            System.out.println("\n--- VEÍCULO ---");
            v.exibirDados();
        }
    }
}
