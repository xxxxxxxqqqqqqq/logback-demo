package com.ethan.logbackdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@SpringBootApplication
@EnableScheduling
public class LogbackDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogbackDemoApplication.class, args);
    }

    @Scheduled(cron = "*/1 * * * * ? ")
    public void log() {
        log.error("error===================");
        log.warn("warn=====================");
        log.info("info================");
        log.debug("debug===================");
        log.trace("trace====================");
    }

}
