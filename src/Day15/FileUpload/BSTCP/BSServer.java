package Day15.FileUpload.BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class BSServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        Socket socket = server.accept();
        //转换流读取浏览器的请求信息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String request =  br.readLine();
        String[] strArr = request.split(" ");
        String path = strArr[1].substring(1);
        System.out.println(path);
        FileInputStream fis = new FileInputStream(path);

        byte[] bytes = new byte[1024];
        int len = 0;
        OutputStream os = socket.getOutputStream();
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        os.write("\r\n".getBytes());
        while ((len= fis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }
        fis.close();
        os.close();
        br.close();
        socket.close();
        server.close();
    }
}
