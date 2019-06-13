package com.super_famicom_coder.songr;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CapitalizeController.class, ReverseTextController.class })
@WebAppConfiguration
public class SongrApplicationTests {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockmvc;

	@Before
	public void setup() throws Exception {
		this.mockmvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void canCapitalizeText() throws Exception {
		this.mockmvc
				.perform(get("/capitalize/{sentence}", "I ate a walnut"))
				.andExpect(status().isOk());
	}

	@Test
	public void canReverseText() throws Exception {
		this.mockmvc
				.perform(get("/reverse")
						.param("sentence", "I ate a walnut"))
				.andExpect(status().isOk());
	}
}
