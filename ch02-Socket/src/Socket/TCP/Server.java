package Socket.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        // 1、监听端口，和client保持接口一致
        ServerSocket ss = new ServerSocket(8888);

        // 2、等待连接，accept让服务器处于线程阻塞状态，当客户端连接出现时回归就绪态
        Socket server = ss.accept();

        // 3、读数据、写回数据
        InputStream is = server.getInputStream();
        byte[] buffer = new byte[1024];
        is.read(buffer);
        System.out.println(new String(buffer));

        OutputStream os = server.getOutputStream();
        os.write("hello, client!".getBytes());
        os.flush();

        // 4、关闭连接
        os.close();
        is.close();
        server.close();
    }
}
