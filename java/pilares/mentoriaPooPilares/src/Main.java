import pilares.heranca.Carro;
import pilares.heranca.Veiculo;
import pilares.polimorfismo.Animal;
import pilares.polimorfismo.Cao;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        veiculo.mover();

        Carro uno = new Carro();
        uno.mover();
        uno.buzinar();

        Carro kombi = new Carro();
        kombi.mover();
        kombi.buzinar();

        Animal animal = new Animal();
        Animal toto = new Cao();

        animal.som();
        toto.som();

    }
}