package new02;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Network02 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://n.news.naver.com/article/079/0003882889?cds=news_media_pc&type=editn");
		System.out.println(url.getContent());
		System.out.println(url.getAuthority());
		System.out.println(url.getPort());
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getQuery());
		System.out.println(url.getPath());
	}

}
