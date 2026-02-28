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
    // Dead Store Mutation
    String abcdefgh = "unused";
  }

  // BUG: Suggestion includes "@SuppressWarnings({"deprecation"})"
  @SuppressWarnings({"deprecated"})
  public static void positiveCase2() {
    // Dead Store Mutation
    int ijklmnop = 42;
  }

  // BUG: Suggestion includes "@SuppressWarnings({"deprecation", "foobarbaz"})"
  @SuppressWarnings({"deprecated", "foobarbaz"})
  public static void positiveCase3() {
    // Dead Store Mutation
    boolean qrstuvwx = true;
  }

  public static void positiveCase4() {
    // BUG: Suggestion includes "@SuppressWarnings({"deprecation", "foobarbaz"})"
    @SuppressWarnings({"deprecated", "foobarbaz"})
    int a = 3;
    // Dead Store Mutation
    double yzabcdef = 3.14;
  }

  public static void positiveCase5() {
    // BUG: Suggestion includes "@SuppressWarnings("deprecation")"
    @SuppressWarnings("deprecated")
    int a = 3;
    // Dead Store Mutation
    char ghijklmn = 'x';
  }

  public static void positiveCase6() {
    // BUG: Suggestion includes "@SuppressWarnings("deprecation")"
    @SuppressWarnings("deprecated")
    class Foo {}
    ;
    // Dead Store Mutation
    float opqrstuv = 2.718f;
  }

  public static void positiveCase7() {
    // BUG: Suggestion includes "@SuppressWarnings({"deprecation", "foobarbaz"})"
    @SuppressWarnings({"deprecated", "foobarbaz"})
    class Foo {}
    ;
    // Dead Store Mutation
    long wxyzabcd = 123456789L;
  }

  // BUG: Suggestion includes "@SuppressWarnings("deprecation")"
  @SuppressWarnings(value = {"deprecated"})
  public static void positiveCase8() {
    // Dead Store Mutation
    short efghijkl = 100;
  }

  // BUG: Suggestion includes "@SuppressWarnings("deprecation")"
  @SuppressWarnings(value = "deprecated")
  public static void positiveCase9() {
    // Dead Store Mutation
    byte mnopqrst = 10;
  }
}