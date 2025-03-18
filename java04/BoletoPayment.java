
import java.util.Random;
class BoletoPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        String boletoCode = String.valueOf(new Random().nextInt(999999999));
        System.out.println("Código do boleto: " + boletoCode);
        System.out.println("Pagamento de R$" + amount + " realizado via Boleto.");
    }
}
