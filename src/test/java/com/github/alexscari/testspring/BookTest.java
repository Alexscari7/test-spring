package com.github.alexscari.testspring;

import com.github.alexscari.testspring.service.BookServiceDispatcher;
import com.github.alexscari.testspring.service.impl.BookAddService;
import com.github.alexscari.testspring.service.impl.BookUpdService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookTest {

	@Autowired
	BookAddService bookAddService;

	@Autowired
	BookUpdService bookUpdService;

	@Autowired
	BookServiceDispatcher bookServiceDispatcher;

	@Test
	void contextLoads() {
		bookServiceDispatcher.dispatch("新书", "bookAdd");
		bookServiceDispatcher.dispatch("旧书", "bookUpdate");
	}

}
