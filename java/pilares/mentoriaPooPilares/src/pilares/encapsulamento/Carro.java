package pilares.encapsulamento;

/**
 * Encapsulamento
 */
public class Carro {
    private int velocidade;  // atributo privado

    public Carro() {
        this.velocidade = 0;
    }

    public void acelerar(int valor) {
        this.velocidade += valor;  // altera a velocidade de forma controlada
    }

    public int getVelocidade() {
        return this.velocidade;  // retorna a velocidade atual
    }
}

