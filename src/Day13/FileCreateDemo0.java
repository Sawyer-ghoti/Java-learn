package Day13;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo0 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\home\\helloIamHere.txt");
        System.out.println(f.exists());
        System.out.println(f.createNewFile());
        System.out.println(f.exists());
        System.out.println(f.delete());


    }
}
