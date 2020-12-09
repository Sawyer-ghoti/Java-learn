package Day4;

public class Keyboard implements USB{
    String name = "keyboard";

    @Override
    public void open() {
        System.out.println("Keyboard is active!");
    }

    @Override
    public void close() {
        System.out.println("Keyboard is inactive!");
    }
}
