public class Main {
    public static void main(String[] args) {

        // Outer o = new Outer();

        // Outer.Inner inner = new Outer.Inner();
        // inner.fun();

        // inner class

        // Outer o = new Outer();

        // Outer.Inner inner = o.new Inner();

        // anonymous class

        Person p = new Person() {

            String name = "Bond";
            void introduce() {
                greet();
                System.out.println("Guest " + name);
            }

            void greet() {
                System.out.println("Hello !");
            }
        };

        p.introduce();

    }
}

// // static nested class
// class Outer {

// private static int x = 8;
// int y = 19;

// static class Inner {
// // extends Main // implements interface

// void fun() {
// // System.out.println("Hello world !");
// System.out.println(x);
// // System.out.println(y); error
// }

// }
// }

// //innner class

// class Outer{
// class Inner{

// }
// }

class Person {
    void introduce() {
        System.out.println("Person");
    }
}