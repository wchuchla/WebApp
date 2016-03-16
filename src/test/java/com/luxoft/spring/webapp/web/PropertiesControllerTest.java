package com.luxoft.spring.webapp.web;


import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class PropertiesControllerTest {

    private PropertiesController controller;

    @Before
    public void setUp() {
        controller = new PropertiesController();
    }

    @Test
    public void testGetAllProperties() throws Exception {
        // given
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

        // when and then
//        mockMvc.perform(MockMvcRequestBuilders.get("/properties"))
//                .andExpect();
    }


}