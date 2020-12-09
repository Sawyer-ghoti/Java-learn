package Day3;

import java.util.ArrayList;

public class DemoRedpackage {

    public static void main(String[] args) {
        Manager Jack = new Manager("jack",100);
        Jack.show();
        Members Rose = new Members("rose",0);
        Members Ana = new Members("ana",0);
        Members Claimentin = new Members("claimentin",0);
        Rose.show();
        Ana.show();
        Claimentin.show();
        System.out.println("=================");
        ArrayList<Integer> list = Jack.send(80,3);

        Rose.recieve(list);
        Ana.recieve(list);
        Claimentin.recieve(list);
        Jack.show();
        Ana.show();
        Rose.show();
        Claimentin.show();
    }
}
