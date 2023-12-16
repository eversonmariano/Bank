package co.everson.bank;

public class App {

    public static void main(String[] args) {
        //criar uma conta (agencia, conta, nome)
        //limitar o nome = 12 caracters
        Account account = new Account("001", "1234", "Dr Japa");

        //sacar valores
        //nao pode sacar mais do que tem
        boolean suceed = account.withDraw(200.00);
        if(!suceed){
            System.out.println("Você não tem saldo suficiente para sacar!");
        }

        //  depositar
        account.deposit(100);
        account.deposit(50);
        account.deposit(100);

        if (!account.withDraw(200)){
            System.out.println("Você não tem saldo suficiente para sacar!");
        }

        if (!account.withDraw(200)){
            System.out.println("Você não tem saldo suficiente para sacar!");
        }


        // informar para o usuario as operaçoes (saque, deposito)
        System.out.println(account);


    }
}
