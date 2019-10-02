package client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Restclient {
	
	
//get method without header

public  CloseableHttpResponse get(String url) throws ClientProtocolException, IOException {
	
	CloseableHttpClient httpclient=HttpClients.createDefault();
	HttpGet httpget =new HttpGet(url);
	CloseableHttpResponse closeableHttpResponse=httpclient.execute(httpget);
	return closeableHttpResponse;
	
	
}
	
//get method with header
public CloseableHttpResponse get(String url,HashMap<String,String>headermap) throws ClientProtocolException, IOException{
	
	CloseableHttpClient httpclient=HttpClients.createDefault();
	HttpGet httpget =new HttpGet(url);
	for(Map.Entry<String ,String> entry:headermap.entrySet()){
		
		httpget.addHeader(entry.getKey(),entry.getValue());
			
	}
	
	CloseableHttpResponse closeableHttpResponse=httpclient.execute(httpget);
	return closeableHttpResponse;
}
	
// post method with header
  
public CloseableHttpResponse post(String url,String entitystring,HashMap<String, String>headermap) throws ClientProtocolException, IOException{
	
	CloseableHttpClient httpclient=HttpClients.createDefault();
	HttpPost httppost =new HttpPost(url);
	httppost.setEntity(new StringEntity(entitystring));
	for(Map.Entry<String,String>entry:headermap.entrySet()){
		
		httppost.addHeader(entry.getKey(),entry.getValue());
		
	}
	CloseableHttpResponse closeableHttpResponse=httpclient.execute(httppost);
	return closeableHttpResponse;
	
	
	
	
	
}

	
}
