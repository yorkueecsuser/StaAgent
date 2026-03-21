package com.sast.home.tools.codellama/sonar_clean_java_code_codellama.result_sonar_57;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
class RootBootApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RootBootApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RootBootApp.class, args);
    }

    public void showBug() {
        // This method demonstrates the bug by calling the configure method
        configure(new SpringApplicationBuilder());
    }
}

// Mutant 1: Equivalent Loop Replacement
public void showBug() {
    do {
        configure(new SpringApplicationBuilder());
    } while (true);
}

// Mutant 2: Equivalent Loop Replacement
public void showBug() {
    do {
        configure(new SpringApplicationBuilder());
    } while (false);
}