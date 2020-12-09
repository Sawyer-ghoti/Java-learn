package Day4;

public class Demo0 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
//        Mouse mouse = new Mouse();
//        USB usbMouse = mouse;
        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);
        computer.powerOff();
    }
}
