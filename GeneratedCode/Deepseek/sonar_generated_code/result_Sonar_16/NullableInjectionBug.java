package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;

import org.springframework.beans.factory.annotation.Value;

public class NullableInjectionBug {
  private String field;

  public String showBug(@Value("${missing.property:defaultValue}") String parameter) {
    if (parameter == null) {
      parameter = "defaultValue";
    }
    return field + parameter; // BUG: Nullable injected fields and parameters should provide a default value
  }

  public static void main(String[] args) {
    NullableInjectionBug bug = new NullableInjectionBug();
    System.out.println(bug.showBug(null));
  }
}