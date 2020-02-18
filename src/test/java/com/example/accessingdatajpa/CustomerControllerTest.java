package com.example.accessingdatajpa;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {

	@Autowired
	private MockMvc mockMvc;
	// fake user object grabbing end points in our application
	
	@Mock 
	Customer customerOne;
	
	@Mock
	Customer customerTwo;
	
	@MockBean
	CustomerRepository customerRepo;
	
	
	@Test
	public void shouldGetStatusOfOkWhenNaviagtingToAllCustomers() throws Exception {
		this.mockMvc.perform(get("/customers")).andExpect(status().isOk())
		.andExpect(view().name("customers"));	
	}
	
	

}
