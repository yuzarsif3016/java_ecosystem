import java.util.Objects;

public class Demo {
    public static void main(String[] args)  throws CloneNotSupportedException{

        Student s1 = new Student();
        s1.name = "yusuf";
        s1.age = 29;
        // System.out.println(s1);

        Student s2 = new Student();
        s2.name = "yusuf";
        s2.age = 29;

        System.out.println(s1.equals(s2));

        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());

        System.out.println(s1.getClass().getName());


        Student s3 = (Student) s2.clone();

        System.out.println(s3);

    }

}

class Student implements Cloneable{

    String name;
    int age;

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        // final int prime = 31;
        // int result = 1;
        // result = prime * result + ((name == null) ? 0 : name.hashCode());
        // result = prime * result + age;
        // return result;

        return Objects.hash(age,name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    
    

}
