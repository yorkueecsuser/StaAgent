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

/**
 * Negative cases for {@code SuppressWarningsDeprecated}.
 *
 * @author sjnickerson@google.com (Simon Nickerson)
 */
class SuppressWarningsDeprecatedNegativeCases {
  @SuppressWarnings({"deprecation"})
  public static void negativeCase1() {
    boolean conditionWhile1 = getCondition();
    while (conditionWhile1) {
      // Unreachable while loop
    }
  }

  @SuppressWarnings("deprecation")
  public static void negativeCase2() {
    boolean conditionWhile2 = getCondition();
    while (conditionWhile2) {
      // Unreachable while loop
    }
  }

  public static void negativeCase3() {
    @SuppressWarnings({"deprecation"})
    int a = 3;
    boolean conditionWhile3 = getCondition();
    while (conditionWhile3) {
      // Unreachable while loop
    }
  }

  public static void negativeCase4() {
    @SuppressWarnings("deprecation")
    int a = 3;
    boolean conditionWhile4 = getCondition();
    while (conditionWhile4) {
      // Unreachable while loop
    }
  }

  public static void negativeCase5() {
    @SuppressWarnings({"deprecation"})
    class Foo {}
    Foo a = null;
    boolean conditionWhile5 = getCondition();
    while (conditionWhile5) {
      // Unreachable while loop
    }
  }

  public static void negativeCase6() {
    @SuppressWarnings("deprecation")
    class Bar {}
    Bar b = null;
    boolean conditionWhile6 = getCondition();
    while (conditionWhile6) {
      // Unreachable while loop
    }
  }

  private static boolean getCondition() {
    return false; // This method will always return false, ensuring the loops are unreachable
  }
}