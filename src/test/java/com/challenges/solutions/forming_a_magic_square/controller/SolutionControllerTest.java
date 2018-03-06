package com.challenges.solutions.forming_a_magic_square.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.challenges.solutions.forming_a_magic_square.service.SolutionService;


@RunWith(SpringRunner.class)
@WebMvcTest(SolutionController.class)
public class SolutionControllerTest {
	@MockBean
	private SolutionService service;
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getSolutionTest() throws Exception {
		Mockito.when(service.getCountOfWrongElements(Mockito.eq(new int[][] { { 4, 8, 2 }, { 4, 5, 7 }, { 6, 1, 6 } })))
				.thenReturn(4);
		mockMvc.perform(get("/getCountOfWrongElements?mat=4,8,2&mat=4,5,7&mat=6,1,6")).andExpect(status().isOk())
		.andExpect(content().string("4"));
	}

}