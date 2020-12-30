package Day15.FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1.创建一个服务器ServerSocket对象，和系统要指定的端口号
 * 2.使用ServerSocket对象中的方法accept，获取到请i去的客户端Socket对象
 * 3.使用Socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象
 * 4.判断d:\\upload文件夹是否存在，不存在则创建
 * 5.创建一个本地字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地
 * 6.使用网络字节输入流InputStream对象中的方法read，读取客户端上传的文件
 * 7.使用本地字节输出流FileOutputStream，货哦渠道网络字节输出流OutputStream对象
 * 8.使用Socket对象中的方法getOutouStream，获取到网络字节输出流OutputStream对象
 *
 *
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        //读取客户端上传的文件
        InputStream is = socket.getInputStream();
        File file = new File("C:\\pic");
        if (!file.exists()){
            file.mkdirs();
        }
        //写入本地源
        FileOutputStream fos = new FileOutputStream(file+"\\copy.jpg");
        int len;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        //反馈给客户端“已经上传”
        OutputStream os = socket.getOutputStream();
        os.write("##Already uploaded##".getBytes());
        //        socket.getOutputStream().write("##Already uploaded##".getBytes());
        socket.close();
        server.close();

    }
}
