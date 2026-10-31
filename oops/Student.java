class Student {

    private int age;
    private String name;
    private String college;
    private int roll_no;


    public Student(){
        
    }

    public Student(int age, String name, String college, int roll_no) {
        this.age = age;
        this.name = name;
        this.college = college;
        this.roll_no = roll_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + ", college=" + college + ", roll_no=" + roll_no + "]";
    }

    // behaviors
    public void eat() {
        System.out.println(this.name + " is eating");
    }

}
