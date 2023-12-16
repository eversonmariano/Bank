package co.everson.bank;

public class App {

    public static void main(String[] args) {
 	  Account account = new Account("001", "1234", "Dr Japa");

        Scanner scanner = new Scanner(System.in);

       while (true){
           System.out.println("D - Deposito; S - Sacar; E - Sair ");
           String operacao = scanner.nextLine();

           if (operacao.equals("D")) {
               System.out.println("Qual o valor do depósito?");
               double value = scanner.nextDouble();
               account.deposit(value);
           } else if (operacao.equals("S")) {
               System.out.println("Qual o valor do saque?");
               double value = scanner.nextDouble();
               if (!account.withDraw(value)) {
                   System.out.println("Saldo indisponível!");
               }
           } else if (operacao.equals("E")) {
               break;
           }
           else {
               System.out.println("Comando inválido, tente novamente!");
           }

           scanner = new Scanner(System.in);
       }




    }
}
