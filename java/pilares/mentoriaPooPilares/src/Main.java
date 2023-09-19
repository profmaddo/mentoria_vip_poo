import pilares.heranca.Carro;
import pilares.heranca.Veiculo;

public class Main {
    public static void main(String[] args) {


        Veiculo veiculo = new Veiculo();
        veiculo.mover();

        Carro uno = new Carro();
        uno.mover();
        uno.buzinar();

    }
}