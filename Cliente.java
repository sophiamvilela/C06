public class Cliente
{
    String nome;
    long cpf;
    Computador[] computadores = new Computador[3];

    // Adiciona computadores à lista de compra do cliente
    public void addComputador(Computador computador)
    {
        // Passando pelo vetor computadores, caso haja uma posição vazia, um novo computador é inserido
        for (int i = 0; i < computadores.length; i++)
        {
            if (computadores[i] == null)
            {
                computadores[i] = computador;
                break;
            }
        }
    }

    // Utilizei essa função para mostrar as informações dos clientes também
    public void mostraCompras()
    {
        System.out.println("Informações do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println();

        System.out.println("Suas compras: ");
        float total = 0;

        for (int i = 0; i < computadores.length; i++)
        {
            if (computadores[i] != null)
            {
                computadores[i].mostraPCConfigs(); // chama o método que imprime as configurações do computador
                total += computadores[i].preco; // soma o preço desse computador ao total
                System.out.println();
            }
        }
        System.out.println("Valor total: R$" + total);
    }

    public float calculaTotalCompra()
    {
        float total = 0;
        for (int i = 0; i < computadores.length; i++)
        {
            if (computadores[i] != null)
            {
                total += computadores[i].preco;
            }
        }
        return total;
    }
}