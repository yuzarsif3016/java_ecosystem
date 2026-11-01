package intercae03;

public interface C extends A{

    default void fun(){
        System.out.println(" C - fun called");
    }
}
