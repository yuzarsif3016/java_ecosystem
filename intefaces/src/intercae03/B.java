package intercae03;

public interface B extends A{

    default void fun(){
        System.out.println(" B - fun called");
    }
}
