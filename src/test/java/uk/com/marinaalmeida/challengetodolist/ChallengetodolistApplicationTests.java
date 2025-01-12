package uk.com.marinaalmeida.challengetodolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import uk.com.marinaalmeida.challengetodolist.entity.Todo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ChallengetodolistApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTodoSuccess() {
		var todo  = new Todo(
				"todo 1",
				"desc todo 1",
				false,
				1
		);

		webTestClient
				.post()
				.uri("/todos")
				.bodyValue(todo)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("$[0].name").isEqualTo(todo.getName())
				.jsonPath("$[0].description").isEqualTo(todo.getDescription())
				.jsonPath("$[0].concluded").isEqualTo(todo.isConcluded())
				.jsonPath("$[0].priority").isEqualTo(todo.getPriority());

	}

	@Test
	void testCreateTodoFailure() {

	}

}
