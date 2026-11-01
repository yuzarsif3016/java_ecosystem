package classes02;

import interface02.OfLinePayment;
import interface02.OnLinePayment;

public class DebitCard implements OfLinePayment,OnLinePayment {

    @Override
    public void pay() {
        System.out.println("Paying via debit card....");
        //System.out.println("interface variable value" + PI);
    }
}
