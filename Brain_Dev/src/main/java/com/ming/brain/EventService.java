package com.ming.brain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("test")
public class EventService {
	public List<Event> getEvents() {
		List list = new ArrayList<Event>();
		
		Event event = Event.builder()
				.name("1Â÷")
				.limitOfEnrollment(5)
				.startDateTime(LocalDateTime.of(2020, 1, 10, 10, 2))
				.endDateTime(LocalDateTime.of(2020, 1, 10, 12, 0))
				.build();
		
		Event event2 = Event.builder()
				.name("2Â÷")
				.limitOfEnrollment(5)
				.startDateTime(LocalDateTime.of(2020, 1, 10, 10, 2))
				.endDateTime(LocalDateTime.of(2020, 1, 10, 12, 0))
				.build();
		
		list.add(event);
		list.add(event2);
		
		return list;
	}
}
