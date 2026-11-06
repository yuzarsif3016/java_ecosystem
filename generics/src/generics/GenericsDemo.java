package generics;

public class GenericsDemo {
    public static void main(String[] args) {
//        Box<String> box = new Box("Hello");
//        System.out.println(box.getValue());

        Box<Integer> box = new Box<>(100);
        System.out.println(box.getValue());

//        String s =(String) box.getValue();

    }
}

class Box<T>{
    private T value;

    Box(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}




