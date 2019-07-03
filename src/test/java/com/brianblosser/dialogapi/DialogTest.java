package com.brianblosser.dialogapi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.hamcrest.Matchers.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DialogTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("GET /dialogs/ returns dialogs")
	void getDialogs() throws Exception {

		mockMvc.perform(get("/dialogs/"))
			.andExpect(status().isOk())
			.andExpect(jsonPath("$._embedded.dialogs", hasSize(3)));
	}
}
