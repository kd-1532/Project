package com.clientdata.project.Controller;

import com.clientdata.project.Service.Basic;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TaskServiceController.class)
class TaskServiceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Basic basic;

    @Test
    void postExecuteReturnsOkAndJsonArray() throws Exception {
        when(basic.method()).thenReturn(new String[]{"echo", "Hello, World!"});

        mockMvc.perform(post("/task/execute"))
                .andExpect(status().isOk())
                .andExpect(content().json("[\"echo\",\"Hello, World!\"]"));
    }

}
