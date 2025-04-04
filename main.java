//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        int opcoes = 0;
        Scanner scanner = new Scanner(System.in);

        // Determinando nome e CPF do cliente
        Cliente cliente = new Cliente();
        cliente.nome = "Sophia";
        cliente.cpf = 12345678912L; // java tratou o cpf como int mesmo declarando em long, por isso coloquei o L

        // Criando 3 objetos da classe Computador
        Computador computador_1 = new Computador();
        Computador computador_2 = new Computador();
        Computador computador_3 = new Computador();

        // Determinando as marcas dos computadores
        computador_1.marca = "Apple";
        computador_2.marca = "Samsung";
        computador_3.marca = "Dell";

        // Determinando os preços dos computadores
        computador_1.preco = 9781;
        computador_2.preco = 9781 + 1234;
        computador_3.preco = 9781 + 5678;

        // Determinando o sistema operacional dos computadores
        computador_1.sistema.nome = "Linux Ubuntu";
        computador_2.sistema.nome = "Windows 8";
        computador_3.sistema.nome = "Windows 10";

        // Determinando o tipo de sistema operacional dos computadores (em bits)
        computador_1.sistema.tipo = 32;
        computador_2.sistema.tipo = 64;
        computador_3.sistema.tipo = 64;

        // Adicionando hardware no computador 1
        // Nome e capacidade em Mhz
        HardwareBasico hardware1_1 = new HardwareBasico();
        computador_1.hardware[0] = hardware1_1;
        computador_1.hardware[0].nome = "Pentium Core i3";
        computador_1.hardware[0].capacidade = 2200;

        // Nome e capacidade em Gb
        HardwareBasico hardware1_2 = new HardwareBasico();
        computador_1.hardware[1] = hardware1_2;
        computador_1.hardware[1].nome = "Memória RAM";
        computador_1.hardware[1].capacidade = 8;

        // Nome e capacidade em Gb
        HardwareBasico hardware1_3 = new HardwareBasico();
        computador_1.hardware[2] = hardware1_3;
        computador_1.hardware[2].nome = "HD";
        computador_1.hardware[2].capacidade = 500;

        // Adicionando memória USB no computador 1
        // Nome e capacidade em Gb
        MemoriaUSB memoriaUSB_1 = new MemoriaUSB();
        memoriaUSB_1.nome = "Pen-drive";
        memoriaUSB_1.capacidade = 16;
        computador_1.addMemoriaUSB(memoriaUSB_1);

        // Adicionando hardware no computador 2
        // Nome e capacidade em Mhz
        HardwareBasico hardware2_1 = new HardwareBasico();
        computador_2.hardware[0] = hardware2_1;
        computador_2.hardware[0].nome = "Pentium core i5";
        computador_2.hardware[0].capacidade = 3370;

        // Nome e capacidade em Gb
        HardwareBasico hardware2_2 = new HardwareBasico();
        computador_2.hardware[1] = hardware2_2;
        computador_2.hardware[1].nome = "Memória RAM";
        computador_2.hardware[1].capacidade = 16;

        // Nome e capacidade em Tb
        HardwareBasico hardware2_3 = new HardwareBasico();
        computador_2.hardware[2] = hardware2_3;
        computador_2.hardware[2].nome = "HD";
        computador_2.hardware[2].capacidade = 1;

        // Adicionando memória USB no computador 2
        // Nome e capacidade em Gb
        MemoriaUSB memoriaUSB_2 = new MemoriaUSB();
        memoriaUSB_2.nome = "Pen-drive";
        memoriaUSB_2.capacidade = 32;
        computador_2.addMemoriaUSB(memoriaUSB_2);

        // Adicionando hardware no computador 3
        // Nome e capacidade em Mhz
        HardwareBasico hardware3_1 = new HardwareBasico();
        computador_3.hardware[0] = hardware3_1;
        computador_3.hardware[0].nome = "Pentium core i7";
        computador_3.hardware[0].capacidade = 4500;

        // Nome e capacidade em Gb
        HardwareBasico hardware3_2 = new HardwareBasico();
        computador_3.hardware[1] = hardware3_2;
        computador_3.hardware[1].nome = "Memória RAM";
        computador_3.hardware[1].capacidade = 32;

        // Nome e capacidade em Tb
        HardwareBasico hardware3_3 = new HardwareBasico();
        computador_3.hardware[2] = hardware3_3;
        computador_3.hardware[2].nome = "HD";
        computador_3.hardware[2].capacidade = 2;

        // Adicionando memória USB no computador 3
        // Nome e capacidade em Tb
        MemoriaUSB memoriaUSB_3 = new MemoriaUSB();
        memoriaUSB_3.nome = "HD Externo";
        memoriaUSB_3.capacidade = 1;
        computador_3.addMemoriaUSB(memoriaUSB_3);

        // Interface para escolha da promoção e saída do loop
        do
        {
            System.out.println("Escolha o computador da promoção 1, 2 ou 3. Digite 0 para sair e conferir as compras.");
            opcoes = scanner.nextInt();

                switch (opcoes)
                {
                    case 1:
                        cliente.addComputador(computador_1);
                        break;
                    case 2:
                        cliente.addComputador(computador_2);
                        break;
                    case 3:
                        cliente.addComputador(computador_3);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
        } while (opcoes != 0);

        // Mostrando os dados do cliente, compras e valor total
        System.out.println();
        cliente.mostraCompras();
        System.out.println();
        cliente.calculaTotalCompra();
        scanner.close();
    }
}