package Day17.Junit;

public class Person {
    public String name;
    public int age;
    private int bankCount;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饱");
    }
    public void drink(){
        System.out.println("喝足");
    }

}
