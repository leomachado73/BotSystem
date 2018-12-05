package com.uff.arquitetura;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

@SuppressWarnings("deprecation")
public class Http {
	private static final String USER_AGENT = "Mozilla/5.0";
	private static final String END_POINT = "http://localhost:3000/api/patient/list";

	// HTTP POST request
	@SuppressWarnings("unused")
	public static void sendPost(int key, int cardio, double temperature) throws Exception {

		@SuppressWarnings({ "resource" })
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(END_POINT);

		// add header
		post.setHeader("User-Agent", USER_AGENT);

		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("key", Integer.toString(key)));
		urlParameters.add(new BasicNameValuePair("cardio", Integer.toString(cardio)));
		urlParameters.add(new BasicNameValuePair("temperature", Double.toString(temperature)));

		post.setEntity(new UrlEncodedFormEntity(urlParameters));

		HttpResponse response = client.execute(post);
		System.out.println("\nSending 'POST' request to URL : " + END_POINT);
		System.out.println("Post parameters : " + post.getEntity());
		System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		// System.out.println(result.toString());

	}

}
