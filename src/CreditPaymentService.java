public class CreditPaymentService {
    public double calculate(double loanTime) {
        double creditService;                     //расчет ежемесячного платежа
        double credit = 1_000_000;                //сумма кредита
        double percent = 9.99;                    //годовая процентная ставка
        double minPercentPerMonth;               //ежемесячная процентная ставка
        double annuity;


        minPercentPerMonth = (percent / 100 / 12);

        double minPercentPerMonth1;              //замена математической функции переменной

        minPercentPerMonth1 = 1 + minPercentPerMonth;

        double minPercentPerMonth112;            //замена математической функции переменной

        minPercentPerMonth112 = (minPercentPerMonth1 * minPercentPerMonth1 *    //возведение в степень 12//
                minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1);


        double minPercentPerMonth124 = (minPercentPerMonth1 * minPercentPerMonth1  //возведение в степень 24//
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1);


        double minPercentPerMonth136 = (minPercentPerMonth1 * minPercentPerMonth1 * //возведение в степень 36//
                minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1 *
                minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1 *
                minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1 * minPercentPerMonth1 * minPercentPerMonth1
                * minPercentPerMonth1);

        if (loanTime == 1) {
            annuity = (minPercentPerMonth * minPercentPerMonth112) / (minPercentPerMonth112 - 1);

        } else if (loanTime == 2) {
            annuity = (minPercentPerMonth * minPercentPerMonth124) / (minPercentPerMonth124 - 1);

        } else {
            annuity = (minPercentPerMonth * minPercentPerMonth136) / (minPercentPerMonth136 - 1);
        }


        creditService = credit * annuity;


        return creditService = (int) creditService;

    }

}
