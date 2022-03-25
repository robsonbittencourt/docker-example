package com.bittencourt.docker.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    Logger logger = LoggerFactory.getLogger(RestController.class);


    @GetMapping(value = "/app-name")
    public String getAppName() {
        var appNameFromEnv = System.getenv("APP_NAME");
        logger.info("Request received on " + appNameFromEnv + " app");

        return appNameFromEnv != null ? appNameFromEnv : "default-app-name";
    }

}
