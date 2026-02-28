/*
 * Copyright 2012 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.regex.Pattern;

/**
 * @author mdempsky@google.com (Matthew Dempsky)
 */
class InvalidPatternSyntaxNegativeCases {
  public void foo(String x) {
    boolean condition = getCondition();

    Pattern.compile("t");
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 1");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 1");
    }

    Pattern.compile("t", 0);
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 2");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 2");
    }

    Pattern.matches("t", "");
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 3");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 3");
    }

    "".matches("t");
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 4");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 4");
    }

    "".replaceAll("t", "");
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 5");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 5");
    }

    "".replaceFirst("t", "");
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 6");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 6");
    }

    "".split("t");
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 7");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 7");
    }

    "".split("t", 0);
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 8");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 8");
    }

    Pattern.compile(x);
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 9");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 9");
    }

    Pattern.compile(x, 0);
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 10");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 10");
    }

    Pattern.matches(x, "");
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 11");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 11");
    }

    "".matches(x);
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 12");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 12");
    }

    "".replaceAll(x, "");
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 13");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 13");
    }

    "".replaceFirst(x, "");
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 14");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 14");
    }

    "".split(x);
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 15");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 15");
    }

    "".split(x, 0);
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code 16");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code 16");
    }
  }

  private boolean getCondition() {
    return false;
  }
}