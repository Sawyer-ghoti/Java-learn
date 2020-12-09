package Day5;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed myRed = new MyRed("微信红包");
        myRed.setOwnerName("Musk");
        //平均分配红包
//        OpenMode avgOpen = new AvgOpen();
//        myRed.setOpenWay(avgOpen);
        //随机分配红包
        OpenMode ranOpen = new RandomOpen();
        myRed.setOpenWay(ranOpen);
    }
}
