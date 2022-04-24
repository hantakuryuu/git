package okta.api.access;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
public class Okta1Application {

	//	public static void main(String[] args) throws InterruptedException, ExecutionException {
	//		//		RestTemplate restTemplate = new RestTemplate();
	//
	//
	//		HttpHeaders headers = new HttpHeaders();
	//		String OKTA_URL = "https://exp-corp.okta.com/api/v1/users?search=profile.saiban+gt+0+and+profile.saiban+lt+3";
	//		headers.setContentType(MediaType.APPLICATION_JSON);
	//		headers.add("Authorization", "SSWS " + "00FqPK7H5cy6lG9Y6LU2i3bk9i1Ozq1xO3dKtWQEy3");
	//
	//		HttpEntity<String> request = new HttpEntity<>(headers);
	//
	//	}

	//	public static void main(String[] args) {
	//        List<String> query1List = new ArrayList<String>();
	//        List<String> res1 = new ArrayList<String>();
	//        List<String> query2List = new ArrayList<String>();
	//        List<String> res2 = new ArrayList<String>();
	//        for(int i = 0; i < 10; i++){
	//            query1List.add(Integer.toString(i));
	//            query2List.add(Integer.toString(i+10));
	//        }
	//        Thread t1 = new Thread(new Runnable(){
	//            @Override
	//            public void run() {
	//                query1List.stream().forEach(x -> {
	//                     res1.add(x + "a");
	//                     System.out.println(x + "a");
	//                });
	//            }
	//        });
	//        Thread t2 = new Thread(new Runnable(){
	//            @Override
	//            public void run() {
	//                query2List.stream().forEach(x ->{
	//                    res2.add(x + "b");
	//                    System.out.println(x + "b");
	//                });
	//            }
	//        });
	//        t1.start();
	//        t2.start();
	//        try {
	//            t1.join();
	//            t2.join();
	//        } catch (InterruptedException e) {
	//            e.printStackTrace();
	//        }
	//    }
	//}
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

		List<TestJob> jobs = new ArrayList<TestJob>();
		for (int i = 0; i < OKTA_URL.length; i++) {
			jobs.add(new TestJob(i, OKTA_URL[i]));
		}
		jobs.parallelStream().forEach(x -> {
			//この中間操作はスレッドセーフな必要あり
			x.doJob();
		});
		Long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}

class TestJob {
	private int i;
	private String url;

	public TestJob(int i, String url) {
		this.i = i;
		this.url = url;
	}

	public void doJob() {
		try {
			//Thread.sleep(100L);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.add("Authorization", "SSWS " + "00FqPK7H5cy6lG9Y6LU2i3bk9i1Ozq1xO3dKtWQEy3");

			HttpEntity<String> request = new HttpEntity<>(headers);
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<? extends ArrayList> responseEntity = restTemplate.exchange(this.url, HttpMethod.GET,
					request, new ArrayList<Object>().getClass());

			List list = new ArrayList();
			for (int i = 0; i < responseEntity.getBody().size(); i++) {
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
				list.add(map);
			}
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}