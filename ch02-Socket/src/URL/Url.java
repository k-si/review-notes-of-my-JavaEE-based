package URL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Url {

    public static void main(String[] args) throws IOException {

        String link = "";
        URL myUrl = new URL(link);

//        通过url获取响应信息，都是get
//        String host = myUrl.getHost();
//        int port = myUrl.getPort();

        // 直接由URL对象获取输入流
        InputStream is = myUrl.openStream();
        OutputStream os = new FileOutputStream("");

        // 循环读写，需要重点掌握
        int len = 0;
        while ((len = is.read()) != -1)
            os.write(len);

        is.close();
        os.close();
    }
}
