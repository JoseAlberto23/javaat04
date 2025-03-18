import java.util.Random;

class PixPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        String pixCode = String.valueOf(new Random().nextInt(999999999));
        System.out.println("Código Pix gerado: " + pixCode);
        System.out.println("Pagamento de R$" + amount + " realizado via Pix.");
    }
}