package Day13;

import java.io.*;

public class IOStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
        FileOutputStream fos1 = new FileOutputStream("test[].txt");
        byte[] bytes = "北美反人类匪帮必将毁灭".getBytes();
        fos1.write(bytes);
        fos1.close();


        File file = new File("testIndex.txt");
        FileOutputStream fos2 = new FileOutputStream(file);
        byte[] bytes1 = "我是您儿子的朋友".getBytes();
        fos2.write(bytes1,1,3);
        fos2.close();//中文字符会在读取的时候报错，出现乱码，一个中文字符在utf-8编码下占三个字符，此时应该使用FileReader

        File file1 = new File("test[].txt");
        FileInputStream fis = new FileInputStream(file1);
        int len;
        while ((len=fis.read(new byte[5]))!=-1){
            System.out.println((char)len);
        }
        fis.close();

        FileReader fr = new FileReader("test[].txt");

        while ((len=fr.read())!=-1){
            System.out.println((char)len);
        }
        fr.close();

        FileWriter fw = new FileWriter("testWriter.txt");
        char[] chars = "我是你爹".toCharArray();
        fw.write(chars,1,2);
        fw.close();

        //追加输入
        FileWriter fw1 = new FileWriter("testAppend.txt",true);
        for (int i = 0; i < 10; i++) {
            fw1.write("我好了"+i+"秒"+"\n");
        }
        fw1.close();
    }
}
