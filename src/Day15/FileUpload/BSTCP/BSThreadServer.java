package Day15.FileUpload.BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class BSThreadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server =  new ServerSocket(8080);
        while (true){
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String line = br.readLine();
                        System.out.println(line);
                        String[] arr = line.split(" ");
                        String htmlpath = arr[1].substring(1);
                        FileInputStream fis = new FileInputStream(htmlpath);
                        OutputStream os = socket.getOutputStream();

                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        os.write("\r\n".getBytes());

                        int len;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1){
                            os.write(bytes,0,len);
                        }
                        fis.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
