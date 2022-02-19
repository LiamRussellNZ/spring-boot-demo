package com.example.demo

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

	@Autowired
	private MockMvc mvc

	@Test
	void getGreeting() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/").accept(
				MediaType.APPLICATION_JSON
		)).andExpect(status().isOk())
		.andExpect(content().string(equalTo("Greetings from SpringBoot")))
	}

	@Test
	void getHelloMessage() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get('/hello').accept(
				MediaType.APPLICATION_JSON
		)).andExpect(status().isOk())
		.andExpect(content().string(equalTo('Hello world, this is SpringBoot')))
	}

	@Test
	void greetPersonReturnsAGreeting() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get('/person?firstName=liam&lastName=russell').accept(
				MediaType.APPLICATION_JSON
		)).andExpect(status().isOk())
		.andExpect(content().string(equalTo('Hello liam russell')))
	}
}
