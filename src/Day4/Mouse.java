package Day4;

public class Mouse implements USB

{
    String name = "Mouse";
    @Override
    public void open() {
        System.out.println("Mouse is active!");
    }

    @Override
    public void close() {
        System.out.println("Mouse is inactive!");
    }
}
