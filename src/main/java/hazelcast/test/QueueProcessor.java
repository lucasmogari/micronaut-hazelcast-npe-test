package hazelcast.test;

import java.util.Map;
import java.util.concurrent.BlockingQueue;

import org.reactivestreams.Publisher;

import io.reactivex.Flowable;

class QueueProcessor {

	private final BlockingQueue<String> queue;

	private final Map<String, String> map;

	QueueProcessor(BlockingQueue<String> queue, Map<String, String> map) {
		this.queue = queue;
		this.map = map;
	}

	Publisher<String> test(String msg) {
		if (queue == null) {
			System.err.println("QUEUE is null!");
		}
		if (map == null) {
			System.err.println("MAP is null!");
		}
		return Flowable.just(msg);
	}
}
