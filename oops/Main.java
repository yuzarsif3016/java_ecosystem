public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world !");

        Student s1 = new Student(28, "Yusuf", "SSGM", 101);
        System.out.println(s1);
        s1.eat();


        Student s2 = new Student(25, "Sonu", "SSGM", 102);
        System.out.println(s2);
        s2.eat();
    }
    
}
