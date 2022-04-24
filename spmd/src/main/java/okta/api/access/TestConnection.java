package okta.api.access;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestConnection {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 20; i++) {
				HttpURLConnection urlConnection = null;
				URL url = new URL("http://localhost:8080/springmvc-2/testResponseEntity");
				urlConnection = (HttpURLConnection) url.openConnection();
				urlConnection.setDoOutput(true);
				urlConnection.setChunkedStreamingMode(0);
				urlConnection.connect();
				urlConnection.getHeaderFields();

				OutputStream out = new BufferedOutputStream(urlConnection.getOutputStream());
				//writeStream(out);

				InputStream in = new BufferedInputStream(urlConnection.getInputStream());
				//readStream(in);
				//urlConnection.disconnect();
			}
		} catch (Exception e) {
		}
	}
}