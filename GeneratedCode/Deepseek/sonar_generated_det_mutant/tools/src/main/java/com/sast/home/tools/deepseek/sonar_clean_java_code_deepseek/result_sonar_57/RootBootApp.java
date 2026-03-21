package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek.result_sonar_57;

import org.springframework.boot.SpringApplication;

class RootBootApp {
    // BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
    public void showBug() {
        SpringApplication.run(RootBootApp.class);
    }
	
	// Mutation: Renaming method
    public void showBugMutant() {
        SpringApplication.run(RootBootApp.class);
    }
}