package Day14;

import java.io.*;

public class CodingTransFormDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("我是GBK格式的文本.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("UTF-8格式的文本.txt"),"UTF-8");
        int len = 0;
        while ((len = isr.read())!=-1){
            osw.write(len);
        }

        osw.close();
        isr.close();

    }
}
