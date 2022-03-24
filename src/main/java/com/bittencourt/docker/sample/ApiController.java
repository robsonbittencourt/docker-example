package com.bittencourt.docker.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(value = "/app-name")
    public String getAppName() {
        var appNameFromEnv = System.getenv("APP_NAME");
        return appNameFromEnv != null ? appNameFromEnv : "default-app-name";
    }

}
