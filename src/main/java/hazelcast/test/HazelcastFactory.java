package hazelcast.test;

import javax.inject.Named;
import javax.inject.Singleton;

import com.hazelcast.collection.IQueue;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

import io.micronaut.context.annotation.Factory;

@Factory
class HazelcastFactory {

	@Singleton
	@Named("test-queue")
	IQueue<String> testQueue(HazelcastInstance hazelcastInstance) {
		return hazelcastInstance.getQueue("test-queue");
	}

	@Singleton
	@Named("test-map")
	IMap<String, String> testMap(HazelcastInstance hazelcastInstance) {
		return hazelcastInstance.getMap("test-map");
	}
}
