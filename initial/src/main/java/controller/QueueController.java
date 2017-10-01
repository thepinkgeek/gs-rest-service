package controller;

import model.Queue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.QueueItem;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@RestController
public class QueueController {

	@RequestMapping("/queue")
	public Set<QueueItem> queue() {
		RestTemplate restTemplate = new RestTemplate();
		Queue queue = restTemplate.getForObject("http://localhost:8080", Queue.class);
		return queue.getQueueItems();
	}
}