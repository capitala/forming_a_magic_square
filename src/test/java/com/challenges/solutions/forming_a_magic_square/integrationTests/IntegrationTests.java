package com.challenges.solutions.forming_a_magic_square.integrationTests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.challenges.solutions.forming_a_magic_square.App;

@RunWith(SpringRunner.class)
@SpringBootTest(
	webEnvironment=WebEnvironment.RANDOM_PORT,
	classes=App.class
)
@AutoConfigureMockMvc
public class IntegrationTests {
@Autowired
private MockMvc mockMvc;
@Test
public void getCountOfWrongElementsTest() throws Exception {
	mockMvc.perform(get("/getCountOfWrongElements?mat=4,8,2&mat=4,5,7&mat=6,1,6"))
	.andExpect(content().string("4"));
	;
}
}
