package Day3;

public class User {
    private int money;
    private String name;

    public User() {
    }

    public User(String name, int money){
        this.setMoney(money);
        this.setName(name);
    }

    public void show(){
        System.out.println("My name is "+this.name+".I have "+this.money);
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
