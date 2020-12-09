package Day1;

public class Student {
    String name;
    String age;

    public Student(String a,String b) {
        this.setAge(a);
        this.setName(b);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
