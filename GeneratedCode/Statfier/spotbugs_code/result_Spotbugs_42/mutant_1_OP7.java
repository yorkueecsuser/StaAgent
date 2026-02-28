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
 * Positive cases for {@code SuppressWarningsDeprecated}.
 *
 * @author sjnickerson@google.com (Simon Nickerson)
 */
class SuppressWarningsDeprecatedPositiveCases {

  // BUG: Suggestion includes "@SuppressWarnings("deprecation")"
  @SuppressWarnings("deprecated")
  public static void positiveCase1() {
    boolean conditionWhile1 = getCondition();
    while (conditionWhile1) {
      // Unreachable code
    }
  }

  // BUG: Suggestion includes "@SuppressWarnings("deprecation")"
  @SuppressWarnings({"deprecated"})
  public static void positiveCase2() {
    boolean conditionWhile2 = getCondition();
    while (conditionWhile2) {
      // Unreachable code
    }
  }

  // BUG: Suggestion includes "@SuppressWarnings({"deprecation", "foobarbaz"})"
  @SuppressWarnings({"deprecated", "foobarbaz"})
  public static void positiveCase3() {
    boolean conditionWhile3 = getCondition();
    while (conditionWhile3) {
      // Unreachable code
    }
  }

  public static void positiveCase4() {
    // BUG: Suggestion includes "@SuppressWarnings({"deprecation", "foobarbaz"})"
    @SuppressWarnings({"deprecated", "foobarbaz"})
    int a = 3;
    boolean conditionWhile4 = getCondition();
    while (conditionWhile4) {
      // Unreachable code
    }
  }

  public static void positiveCase5() {
    // BUG: Suggestion includes "@SuppressWarnings("deprecation")"
    @SuppressWarnings("deprecated")
    int a = 3;
    boolean conditionWhile5 = getCondition();
    while (conditionWhile5) {
      // Unreachable code
    }
  }

  public static void positiveCase6() {
    // BUG: Suggestion includes "@SuppressWarnings("deprecation")"
    @SuppressWarnings("deprecated")
    class Foo {}
    ;
    boolean conditionWhile6 = getCondition();
    while (conditionWhile6) {
      // Unreachable code
    }
  }

  public static void positiveCase7() {
    // BUG: Suggestion includes "@SuppressWarnings({"deprecation", "foobarbaz"})"
    @SuppressWarnings({"deprecated", "foobarbaz"})
    class Foo {}
    ;
    boolean conditionWhile7 = getCondition();
    while (conditionWhile7) {
      // Unreachable code
    }
  }

  // BUG: Suggestion includes "@SuppressWarnings("deprecation")"
  @SuppressWarnings(value = {"deprecated"})
  public static void positiveCase8() {
    boolean conditionWhile8 = getCondition();
    while (conditionWhile8) {
      // Unreachable code
    }
  }

  // BUG: Suggestion includes "@SuppressWarnings("deprecation")"
  @SuppressWarnings(value = "deprecated")
  public static void positiveCase9() {
    boolean conditionWhile9 = getCondition();
    while (conditionWhile9) {
      // Unreachable code
    }
  }

  private static boolean getCondition() {
    return false;
  }
}