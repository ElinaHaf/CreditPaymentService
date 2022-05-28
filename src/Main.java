public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double loanTime = 1;   //срок кредита(год)

        double creditService = service.calculate(loanTime);

        System.out.println(creditService);
    }
}