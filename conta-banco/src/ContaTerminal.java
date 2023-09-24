import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        String nomeCliente;
        String agencia;
        Integer numeroDaConta;
        Double saldo;

        //TODO: conhecer e importar a classe Scanner
        //Obter pela scanner os valores digitados no terminal
                
       
        Scanner leitor = new Scanner(System.in);   
            
        
        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite seu nome completo, em seguida tecle 'Enter'!");
           nomeCliente = leitor.nextLine();

        System.out.println("Por favor, informe sua agência, em seguida tecle 'Enter'!");
           agencia = leitor.nextLine();

        System.out.println("Por favor, digite o número de sua conta, em seguida tecle 'Enter'!");
           numeroDaConta = leitor.nextInt();
        
        System.out.println("Por favor, digite seu saldo, em seguida tecle 'Enter'!");
           saldo = leitor.nextDouble();
        
        //Exibir a mensagem conta criada
        System.out.println("*Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco!"+
        "\n"+" Sua agência é "+ agencia+", conta "+numeroDaConta+" e seu saldo "+ String.format("%.2f", saldo) +" já está disponível para saque.*");

    }
}
