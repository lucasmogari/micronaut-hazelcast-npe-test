package hazelcast.test;

import javax.inject.Inject;

import org.reactivestreams.Publisher;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
class TestController {

	@Inject
	private QueueProcessor processor;

	@Get("/{msg}")
	Publisher<String> test(String msg) {
		return processor.test(msg);
	}
}
