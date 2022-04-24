package okta.api.access;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
public class Okta1Application2 {

	public static void main(String[] args) {
		Long start = System.currentTimeMillis();
		String[] OKTA_URL = {
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200",
				"https://exp-corp.okta.com/api/v1/users?limit=200"
		};

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", "SSWS " + "00FqPK7H5cy6lG9Y6LU2i3bk9i1Ozq1xO3dKtWQEy3");

		HttpEntity<String> request = new HttpEntity<>(headers);
		RestTemplate restTemplate = new RestTemplate();
		for (int i = 0; i < OKTA_URL.length; i++) {
			ResponseEntity<? extends ArrayList> responseEntity = restTemplate.exchange(OKTA_URL[i], HttpMethod.GET,
					request, new ArrayList<Object>().getClass());
			Map map = (Map) responseEntity.getBody().get(i);
			map.remove("id");
			map.remove("status");
			map.remove("firstName");
			map.remove("lastName");
			map.remove("mobilePhone");
			map.remove("middleName");
			map.remove("credentials");
			map.remove("_links");
			map.remove("secondEmail");
		}

		Long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
