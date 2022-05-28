public class CreditPaymentService {
    public double calculate(double loanTime) {
        double creditService;                     //расчет ежемесячного платежа
        double credit = 1_000_000;                //сумма кредита
        double persent = 9.99;                    //годовая процентная ставка
        double minPersentForMounth;               //ежемесячная процентная ставка
        double kannyitet;


        minPersentForMounth = (persent / 100 / 12);

        double minPersentForMounth1;              //замена математической функции переменной

        minPersentForMounth1=1+minPersentForMounth;

        double minPersentForMounth112;            //замена математической функции переменной

        minPersentForMounth112=(minPersentForMounth1 * minPersentForMounth1 *    //возведение в степень 12//
                minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
            * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
            * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
            * minPersentForMounth1);


        double minPersentForMounth124 = (minPersentForMounth1 * minPersentForMounth1  //возведение в степень 24//
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1 
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1);


        double minPersentForMounth136 = (minPersentForMounth1 * minPersentForMounth1 * //возведение в степень 36//
                minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1 *
                minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1 *
                minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1 * minPersentForMounth1 * minPersentForMounth1
                * minPersentForMounth1);

        if (loanTime == 1){
            kannyitet = (minPersentForMounth * minPersentForMounth112)/(minPersentForMounth112 - 1);

        } else if (loanTime == 2){
                kannyitet = (minPersentForMounth * minPersentForMounth124)/(minPersentForMounth124 - 1);

            } else{
            kannyitet = (minPersentForMounth * minPersentForMounth136)/(minPersentForMounth136 - 1);
            }


        creditService=credit*kannyitet;



        return creditService=(int) creditService;

        }

    }
