package Socket.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        // 1、创建socket对象，与服务器建立连接，这里服务器为本机，所以ip为localhost，端口指定为8888
        Socket client = new Socket("localhost", 8888);

        // 2、向服务器传输数据
        OutputStream os = client.getOutputStream();
        os.write("hello".getBytes());
        os.flush(); // 记住一定要flush，刷新缓冲区

        // 3、接受服务器返回的数据
        InputStream is = client.getInputStream();
        byte[] buffer = new byte[1024]; // 这里简单接受数据，只创建一个1024字节的buffer
        is.read(buffer);
        System.out.println(new String(buffer));

        // 4、关闭连接
        is.close();
        os.close();
        client.close();
    }
}
