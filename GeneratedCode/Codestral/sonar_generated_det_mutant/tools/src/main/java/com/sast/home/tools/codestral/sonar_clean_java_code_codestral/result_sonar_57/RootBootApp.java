package com.sast.home.tools.codestral/sonar_clean_java_code_codestral.result_sonar_57;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

class RootBootApp {
    public static void showBug() {
        // Mutant code: Renaming "RootBootApp" to "a"
        // This will not cause any compilation errors, but may lead to runtime errors
        class a extends RootBootApp {}
        SpringApplication.run(a.class);
    }
}

class Application {
    public static void showBug() {
        // Mutant code: Renaming "Application" to "b" and "showBug" to "c"
        // This will not cause any compilation errors, but may lead to runtime errors
        class b {
            public static void c() {
                // This will cause Spring to scan the entire classpath
                SpringApplication.run(Application.class, "org");
            }
        }
        b.c();
    }
}