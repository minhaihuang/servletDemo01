package minhaihuang.servletTest.test02;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

/**
 * 模仿乱码的出现原因，并进行解决
 * @author 黄帅哥
 *
 */
public class ImitateLuanMa {

	public static void main(String[] args) throws Exception {
		//第一步，点击了表单提交按钮
		String username="哈哈";
		//第二步，进行了url编码，将username转换为字节数组
		String temp=URLEncoder.encode(username, "utf-8");//结果为%E5%93%88%E5%93%88
		//第三步，浏览器将temp转为字节数组，返回服务器,
		byte[] b=temp.getBytes();//[37, 69, 53, 37, 57, 51, 37, 56, 56, 37, 69, 53, 37, 57, 51, 37, 56, 56]
		//第四步，服务器接收浏览器返回的字节数组
		byte[] b2=b;
		//第五步，服务器进行将字节数组重新转为URL编码格式的内容
		String msg=new String(b2,"utf-8");
		//第六步，服务器进行解码
		String fianlMsg=URLDecoder.decode(msg, "utf-8");
		//String fianlMsg=URLDecoder.decode(msg,"ISO-8859-1");//åå
		System.out.println(fianlMsg);//输出了哈哈
		
	}
}
