package intercae03;

public class D implements B,C{
    @Override
    public void fun() {
//        System.out.println("Fun is Overridden");
        B.super.fun();
        C.super.fun();
    }
}
