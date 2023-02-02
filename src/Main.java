import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();

        Scanner scanner = new Scanner(System.in);
        account1.deposit(scanner.nextDouble());
        account2.withdrawal(scanner.nextDouble());

        System.out.println("Депозит жана балансыныздагы сумма биригип: " + account1.getBalance());
        System.out.println("Сиздин азыркы учурдагы акчаныз : " + account2.getBalance());
        System.out.println("Сиздин балансынызда  " + account3.getBalance() + " сом болгон");


    }


}