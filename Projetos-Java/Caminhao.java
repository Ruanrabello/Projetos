package jjj;
// Classe Caminhao herda Veiculo
public class Caminhao extends Veiculo {

    // Atributo exclusivo do caminhão
    private int eixos;

    // Construtor com parâmetros
    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano); // chama construtor da classe Veiculo
        this.eixos = eixos;
    }

    // Setter dos eixos
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    // Getter dos eixos
    public int getEixos() {
        return this.eixos;
    }

    // Sobrescrevendo o método exibirDados()
    @Override
    public void exibirDados() {
        super.exibirDados(); // exibe placa e ano
        System.out.println("Eixos: " + this.eixos);
    }
}
