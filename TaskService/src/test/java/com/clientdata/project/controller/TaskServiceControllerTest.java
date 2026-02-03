package com.clientdata.project.controller;

import com.clientdata.project.service.Basic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class TaskServiceControllerTest {

    @Mock
    MockMvc mockMvc;

    @Mock
    Basic basic;

    @Mock
    TaskServiceController taskServiceController;

    @BeforeEach
    void setUp() {
        basic = mock(Basic.class);
        taskServiceController = new TaskServiceController(basic);
        mockMvc = MockMvcBuilders.standaloneSetup(taskServiceController).build();

    }

    @Test
    void postExecuteReturnsOk() throws Exception {
        mockMvc.perform(post("/task/execute"))
                .andExpect(status().isOk());
    }

}

