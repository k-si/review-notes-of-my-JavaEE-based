package URL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnction {

    public static void main(String[] args) throws IOException {

        String link = "";
        URL myUrl = new URL(link);

        // 通过URLConnection获取输入流
        URLConnection conn = myUrl.openConnection();

        InputStream is = conn.getInputStream();
        OutputStream os = new FileOutputStream("");

        int len = 0;
        while ((len = is.read()) != -1)
            os.write(len);
        is.close();
        os.close();
    }
}
