public class Zumbi {

    // nessa classe eu defini as características de cada zumbi (vida e nome)

    double vida;
    String nome;

    double mostraVida() { // retorna o valor da vida do zumbi
        return this.vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia) { // transfere uma quantidade de vida do zumbi atual para o zumbiAlvo
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}