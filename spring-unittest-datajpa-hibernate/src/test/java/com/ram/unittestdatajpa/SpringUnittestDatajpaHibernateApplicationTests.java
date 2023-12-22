package com.ram.unittestdatajpa;

import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ram.unittestdatajpa.repo.UserRepository;

// Run it using coverage
@SpringBootTest
@WebMvcTest
class SpringUnittestDatajpaHibernateApplicationTests {
	// Mocking and unit testing the UserRepository
	@Autowired
	MockMvc mockMvc; // Use direct Rest Calls without using Resttemplate
	@MockBean
	UserRepository repo;
	@Test
	void contextLoads() throws Exception {
		// Mocking the UserRepository
		Mockito.when(repo.findAll()).thenReturn(Collections.emptyList());
		
		MvcResult mvcResult = mockMvc.perform(
				MockMvcRequestBuilders.get("/all/") // Call the Rest Endpoint
				.accept(MediaType.APPLICATION_JSON)
		).andReturn();
		System.out.println(mvcResult.getResponse());
		Mockito.verify(repo).findAll(); // Verify if the mock has been called
	}

}
