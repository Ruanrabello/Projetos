package jjj;
// Classe que representa um veículo genérico
public class Veiculo {

    // Atributos privados (encapsulamento)
    private String placa;
    private int ano;

    // Construtor vazio
    public Veiculo() {}

    // Construtor com parâmetros
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    // Setter da placa
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Setter do ano
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Getter da placa
    public String getPlaca() {
        return this.placa;
    }

    // Getter do ano
    public int getAno() {
        return this.ano;
    }

    // Método para exibir dados do veículo
    public void exibirDados() {
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.ano);
    }
}
