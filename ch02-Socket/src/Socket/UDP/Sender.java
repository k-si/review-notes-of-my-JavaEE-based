package Socket.UDP;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {

    public static void main(String[] args) throws IOException {

        // 1、创建发送方
        DatagramSocket socket = new DatagramSocket();

        // 2、准备数据
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(bos));

        dos.writeInt(10);
        dos.writeUTF("hello");
        dos.writeBoolean(true);
        dos.writeDouble(0.5);
        dos.flush();
        byte[] data = bos.toByteArray();
        dos.close();

        // 3、封装数据
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("127.0.0.1"), 8888);

        // 4、发送数据
        socket.send(packet);

        // 5、释放资源
        socket.close();
    }
}
