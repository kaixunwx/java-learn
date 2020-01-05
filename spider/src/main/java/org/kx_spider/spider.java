package org.kx_spider;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class spider {
    public static void main(String[] args) throws IOException {
        Connection cnt = Jsoup.connect("http://baidu.com");
        Document response = cnt.get();
        System.out.println(response);
    }
}
