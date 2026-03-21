package com.sast.home.tools.codestral/sonar_clean_java_code_codestral.result_sonar_13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Qualifier;

class MyConfiguration {
  // Original methods
  @Bean
  public MyService myService() {
    return new MyService();
  }

  @Bean
  public MyService aBetterService() {
    return new MyService();
  }

  // Method to demonstrate the bug
  public MyService showBug() {
    return myService();
  }

  // Dummy MyService class for demonstration
  class MyService {
    // Dummy implementation
  }

  // Mutant code: Renaming user-defined variables
  @Bean
  @Qualifier("r") // Mutant: Renamed "aBetterService" to "r"
  public MyService renamedBetterService() {
    return new MyService();
  }

  // Method to demonstrate the mutant
  public MyService showMutant() {
    return renamedBetterService();
  }
}