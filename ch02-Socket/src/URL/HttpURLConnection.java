package URL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class HttpURLConnection {

    public static void main(String[] args) throws IOException {

        String link = "";
        URL myUrl = new URL(link);
        URLConnection conn = myUrl.openConnection();

        // 使用HttpURLConnection
        java.net.HttpURLConnection hconn = (java.net.HttpURLConnection) conn;

//        获取Http响应消息头
//        hconn.getContentType();
//        hconn.getContentLength();
//        hconn.getContentEncoding();
//
//        获取Http响应消息状态码
//        hconn.getResponseCode();
//
//        获取响应消息主体
//        hconn.getContent();

        InputStream is = hconn.getInputStream();
        OutputStream os = new FileOutputStream("");

        int len = 0;
        while ((len = is.read()) != -1)
            os.write(len);
        is.close();
        os.close();
    }
}
