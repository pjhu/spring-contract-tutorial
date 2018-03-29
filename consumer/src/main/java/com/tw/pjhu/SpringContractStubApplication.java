package com.tw.pjhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;

@EnableStubRunnerServer
@SpringBootApplication
public class SpringContractStubApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringContractStubApplication.class, args);
    }
}
