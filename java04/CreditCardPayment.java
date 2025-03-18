
import java.util.Scanner;
class CreditCardPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do cartão de crédito:");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento de R$" + amount + " realizado com o cartão " + cardNumber + ".");
    }
}