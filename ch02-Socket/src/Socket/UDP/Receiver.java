package Socket.UDP;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {

    public static void main(String[] args) throws IOException {

        // 1、创建接收方
        DatagramSocket socket = new DatagramSocket(8888);

        // 2、准备容器
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        // 3、阻塞式接收数据
        socket.receive(packet);

        // 4、分析数据
        byte[] cache = packet.getData();
        ByteArrayInputStream bis = new ByteArrayInputStream(cache);
        DataInputStream dis = new DataInputStream(new BufferedInputStream(bis));

        int a = dis.readInt();
        String b = dis.readUTF();
        boolean c = dis.readBoolean();
        double d = dis.readDouble();
        System.out.println(a + " " + b + " " + c + " " + d);

        // 5、释放资源
        socket.close();
    }
}
