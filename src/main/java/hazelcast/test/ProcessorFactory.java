package hazelcast.test;

import javax.inject.Named;
import javax.inject.Singleton;

import com.hazelcast.collection.IQueue;
import com.hazelcast.map.IMap;

import io.micronaut.context.annotation.Factory;

@Factory
class ProcessorFactory {

	@Singleton
	QueueProcessor processorFactory(@Named("test-queue") IQueue<String> queue,
			@Named("test-map") IMap<String, String> map) {
		return new QueueProcessor(queue, map);
	}
}
