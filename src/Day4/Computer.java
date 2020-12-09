package Day4;

public class Computer {
    public void powerOn(){
        System.out.println("Welcome!");
    }
    public void powerOff(){
        System.out.println("See ya!");
    }
    public void useDevice(USB usb){
        usb.open();
        usb.close();
        System.out.println("You have used some sort of device.");
    }

}
