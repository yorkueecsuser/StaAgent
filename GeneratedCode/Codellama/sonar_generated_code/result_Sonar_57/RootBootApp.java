package com.sast.home.tools.sonar_clean_java_code.result_sonar_57;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
public class RootBootApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RootBootApp.public class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RootBootApp.public class, args);
    }

    public void showBug() {
        // This method demonstrates the bug by calling the configure method
        configure(new SpringApplicationBuilder());
    }
}