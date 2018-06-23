package cn.jun.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.Charset;

public class MyHttpClient {

    @Test
    public void test() throws IOException {
        //用来存放我们的结果
        String result;
        HttpGet get = new HttpGet("https://www.baidu.com");
        DefaultHttpClient client = new DefaultHttpClient();
        //这个是用来执行get方法
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
    }

}
