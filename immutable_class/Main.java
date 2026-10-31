public class Main {
    public static void main(String[] args) {
        // Student s1 = new Student(27, "Yusuf");

        // System.out.println(s1.getAge());
        // System.out.println(s1.getName());

        College college = new College("IIT B", "Bombay");

        Student s2 = new Student(26, "Yusuf", college);
        s2.getCollege().name = "IIT G"; //breaks the behavior
    }
}

// Immutable class

// final class Student {
// private int age;
// private String name;

// public Student(int age, String name) {
// this.age = age;
// this.name = name;
// }

// public int getAge() {
// return age;
// }

// public String getName() {
// return name;
// }

// }

//not a pure immutable
final class Student {

    private int age;
    private String name;
    private College college;

    public Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = college;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public College getCollege() {
        return college;
    }

    

}

class College {
    String name;
    String address;

    public College(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
