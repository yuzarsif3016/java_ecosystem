package classes02;

import interface02.OfLinePayment;
import interface02.OnLinePayment;

public class CreditCard implements OnLinePayment, OfLinePayment {

    @Override
    public void pay() {
        System.out.println("Paying via credit card....");
        //System.out.println("interface variable value" + PI);

    }
}
