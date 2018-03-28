package com.tw.pjhu.contracts;

import com.tw.pjhu.SpringContractApplication;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@Ignore
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = SpringContractApplication.class)
@RunWith(SpringRunner.class)
public class AdminHomeBase {

    @Autowired
    WebApplicationContext context;

    @Before
    public void setup() {
        RestAssuredMockMvc.webAppContextSetup(this.context);
    }
}
