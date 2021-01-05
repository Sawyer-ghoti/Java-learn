package Day16;

public class FunctionInterface {
    public static void main(String[] args) {
        //调用show方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());
        //调用show方法，方法的接口是一个接口，所以可以传递接口的匿名内部类
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("##Here I recall the function in my interface.");
            }
        });

        //调用show方法，方法的参数是一个函数式接口，所以我们可以使用Lambda表达式
        show(()->{
            System.out.println("##Here I recall the function in my interface via lambda.");
        });
    }

    public static void show(MyFunctionInterface inter){
        inter.method();
    }
}
