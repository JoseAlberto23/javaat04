import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");

        String choice = scanner.nextLine();

        System.out.println("Digite o valor da transação:");
        double amount = scanner.nextDouble();

        PaymentStrategy strategy = switch (choice) {
            case "1" -> new PixPayment();
            case "2" -> new CreditCardPayment();
            case "3" -> new BoletoPayment();
            default -> throw new IllegalArgumentException("Método de pagamento inválido.");
        };

        PaymentProcessor processor = new PaymentProcessor(strategy);
        processor.process(amount);

        scanner.close();
    }
}
