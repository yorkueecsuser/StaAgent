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
 * Positive cases for {@code UnneededConditionalOperator}.
 *
 * @author sjnickerson@google.com (Simon Nickerson)
 */
class UnneededConditionalOperatorPositiveCases {

  public static void positiveCaseTrueFalseSimple() {
    // BUG: Suggestion includes "isFoo()"
    boolean t = isFoo()? true : false;
    String vbnrhtyq = "unused"; // Dead store
  }

  public static void positiveCaseTrueFalseBinary() {
    // BUG: Suggestion includes "(4 > 5)"
    boolean t = (4 > 5)? true : false;
    int xwvfrtgb = 42; // Dead store
  }

  public static void positiveCaseFalseTrueSimple() {
    // BUG: Suggestion includes "!isFoo()"
    boolean t = isFoo()? false : true;
    double qazwsxed = 3.14; // Dead store
  }

  public static void positiveCaseFalseTrueUnary() {
    // BUG: Suggestion includes "isFoo()"
    boolean t =!isFoo()? false : true;
    char plmoknij = 'a'; // Dead store
  }

  public static void positiveCaseFalseTrueBinary() {
    // BUG: Suggestion includes "(4 <= 5)"
    boolean t = (4 > 5)? false : true;
    boolean zxcvbnml = true; // Dead store
  }

  public static void positiveCaseFalseTrueBinary2() {
    // BUG: Suggestion includes "(4!= 5)"
    boolean t = (4 == 5)? false : true;
    long asdfghjk = 123456789L; // Dead store
  }

  public static void positiveCaseFalseTrueBinaryUnparenthesised() {
    // BUG: Suggestion includes "4 > 5"
    boolean t = 4 <= 5? false : true;
    float poiuytrewq = 2.718f; // Dead store
  }

  public static void positiveCaseFalseTrueBinaryUnparenthesised2() {
    // BUG: Suggestion includes "4 == 5"
    boolean t = 4!= 5? false : true;
    short lkjhgfdsa = 10; // Dead store
  }

  public static void positiveCaseFalseTrueDeMorgan() {
    // BUG: Suggestion includes "(4 == 5 && 2!= 3)"
    boolean t = (4!= 5 || 2 == 3)? false : true;
    byte mnbvcxz = 25; // Dead store
  }

  public static void positiveCaseTrueTrue() {
    // BUG: Suggestion includes "true"
    boolean t = isFoo()? true : true;
    String cvbnrhty = "another unused"; // Dead store
  }

  public static void positiveCaseFalseFalse() {
    // BUG: Suggestion includes "false"
    boolean t = isFoo()? false : false;
    boolean qwertyui = false; // Dead store
  }

  /** Helper method */
  private static boolean isFoo() {
    return true;
  }
}