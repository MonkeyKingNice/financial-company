package com.zengzhou.financial;

import com.zengzhou.financial.home.controller.HomeController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@SpringBootTest
class FinancialApplicationTests {
    private MockMvc mvc;

    @BeforeAll
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();
    }

    @Test
    void hello() {
    }

}
