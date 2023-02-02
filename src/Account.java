public class Account {
    double balance = 1000;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (amount <= balance) {
            balance -= amount;

        } else {
            System.out.println("Недостоточно средств: ");
        }

    }

    public double getBalance() {
        return balance;
    }
}


/*Account деген класс түзүңүз, анын сөзсүз double balance = 1000; деген полясы болсун
жана сиз каалагандай поля кошсоңуз болот.
deposit() - баланска акча кошот,
withdrawal() - баланстан акча алат
методдору болсун.
main методдон 2-3 account түзүп ар кандай операцияларды жасаңыз.*/

