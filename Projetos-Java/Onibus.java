package jjj;
// Classe Onibus herda Veiculo
public class Onibus extends Veiculo {

    // Atributo exclusivo do ônibus
    private int assentos;

    // Construtor com parâmetros
    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano); // chama construtor da classe Veiculo
        this.assentos = assentos;
    }

    // Setter de assentos
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    // Getter de assentos
    public int getAssentos() {
        return this.assentos;
    }

    // Sobrescrevendo exibirDados()
    @Override
    public void exibirDados() {
        super.exibirDados(); // exibe placa e ano
        System.out.println("Assentos: " + this.assentos);
    }
}
