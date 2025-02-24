//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        // criei dois objetos da classe Zumbi (z1 e z2)
        z1.vida = 100;
        z2.vida = 200;
        // atribui valores diferentes para a vida de cada zumbi
        System.out.println("Vida do zumbi z1: " + z1.vida);
        System.out.println("Vida do zumbi z2: " + z2.vida);
        // aqui eu mostrei a quantidade de vida de cada zumbi
        z1 = z2;
        // aqui eu fiz com que z1 e z2 se referissem ao mesmo objeto, então qualquer alteração na vida de um deles também vai alterar o outro
        System.out.println("Fazendo z1 = z2");
        System.out.println("Vida do zumbi z1: " + z1.vida);
        System.out.println("Vida do zumbi z2: " + z2.vida);
        // agora z1 está apontando para o mesmo valor que z2, por isso são iguais

    }
}