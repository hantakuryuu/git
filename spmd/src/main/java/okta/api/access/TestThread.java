package okta.api.access;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThread {
	static final int threadNum = 4;

	public static void main(String[] args) {
		//jobs: 実行したい処理が書かれたクラス, threadpool: 実行するスレッド
		Collection<Callable<String>> jobs = new ArrayList<Callable<String>>();
		ExecutorService threadpool = Executors.newFixedThreadPool(threadNum);
		List<Future<String>> futures; //結果を格納する
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < threadNum; i++) {
			Job t = new Job(i);
			jobs.add(t);
		}
		try {
			futures = threadpool.invokeAll(jobs); //スレッドの実行
			threadpool.shutdown();//新しいタスクを受け付けない
			for (int i = 0; i < threadNum; i++) {
				//結果の取得
				result.add(futures.get(i).get());
			}
			for (String s : result) {
				//結果の表示
				System.out.println(s);
			}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			threadpool.shutdown();
		}
	}
}

class Job implements Callable<String> {
	private int i;

	public Job(int i) {
		this.i = i;
	}

	@Override
	public String call() throws Exception {
		//これはスレッドセーフな必要あり
		Thread.sleep(100L);
		System.out.println(i);
		return "thread " + Integer.toString(i);
	}
}
