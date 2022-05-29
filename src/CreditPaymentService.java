public class CreditPaymentService {
    public double calculate(double loanTime) {
        double creditService;                     //расчет ежемесячного платежа
        double credit = 1_000_000;                //сумма кредита
        double percent = 9.99;                    //годовая процентная ставка
        double minPercentPerMonth;                //ежемесячная процентная ставка
        double annuity;
        double month = loanTime * 12;                 //срок кредита/мес

        minPercentPerMonth = (percent / 100 / 12);

        double degree = Math.pow((minPercentPerMonth + 1), month);  //возведенеие в степень

        annuity = (minPercentPerMonth * degree) / (degree - 1);

        creditService = credit * annuity;


        return creditService = (int) creditService;

    }

}
