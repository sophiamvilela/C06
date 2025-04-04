public class Computador
{
    String marca;
    float preco;

    HardwareBasico[] hardware; // Declarando os atributos do computador (processador, RAM, memória)
    SistemaOperacional sistema;
    MemoriaUSB memoria;

    // Construtor da classe Computador
    public Computador()
    {
        hardware = new HardwareBasico[3];
        sistema = new SistemaOperacional();
    }

    public void mostraPCConfigs()
    {
        System.out.println("Marca - " + marca);
        System.out.println("Preço - R$" + preco);

        // Percorrendo o vetor e imprimindo na tela os hardwares básicos do computador
        for (int i = 0; i < hardware.length ; i++)
        {
            if (hardware[i] != null)
                System.out.println(hardware[i].nome + " - " + hardware[i].capacidade);
        }

        System.out.println("Sistema Operacional - " + sistema.nome + " - " + sistema.tipo + " bits");

        if (memoria != null)
        {
            System.out.println("Memória USB: " + memoria.nome + " - " + memoria.capacidade);
        }
    }

    // O atributo memória deste computador vai receber a memória USB que veio como parâmetro
    public void addMemoriaUSB(MemoriaUSB musb)
    {
        this.memoria = musb;
    }
}