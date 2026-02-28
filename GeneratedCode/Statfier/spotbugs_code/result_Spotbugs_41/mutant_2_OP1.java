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
    // Dead store mutation
    int abcdefgh = 42;
  }

  @SuppressWarnings("deprecation")
  public static void negativeCase2() {
    // Dead store mutation
    String ijklmnop = "unused";
  }

  public static void negativeCase3() {
    @SuppressWarnings({"deprecation"})
    int a = 3;
    // Dead store mutation
    boolean qrstuvwx = true;
  }

  public static void negativeCase4() {
    @SuppressWarnings("deprecation")
    int a = 3;
    // Dead store mutation
    double yzabcd = 3.14;
  }

  public static void negativeCase5() {
    @SuppressWarnings({"deprecation"})
    class Foo {}
    Foo a = null;
    // Dead store mutation
    char efghijkl = 'x';
  }

  public static void negativeCase6() {
    @SuppressWarnings("deprecation")
    class Bar {}
    Bar b = null;
    // Dead store mutation
    float mnopqrst = 2.71f;
  }
}