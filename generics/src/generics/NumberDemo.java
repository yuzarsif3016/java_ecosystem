package generics;

public class NumberDemo {
    public static void main(String[] args) {

        Boxing<Integer> box = new Boxing<>();
        box.value = 20;
        box.printDouble();

    }
}

class Boxing<T extends Number>{

    T value;

    public void printDouble(){
        System.out.println(value.doubleValue());
    }

}
