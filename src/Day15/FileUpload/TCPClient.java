package Day15.FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\13262\\Pictures\\tom.jpg");
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        int len;
        byte[] bytes = new byte[1024];
        while ((len=fis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();

        //接收服务器返回的核实信息
        InputStream is = socket.getInputStream();
        while ((len=is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        System.out.println();
        fis.close();
        socket.close();
    }
}
