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
    boolean x = isFoo()? true : false; // Mutant: Renamed 't' to 'x'
  }

  public static void positiveCaseTrueFalseBinary() {
    // BUG: Suggestion includes "(4 > 5)"
    boolean t = (4 > 5)? true : false;
    boolean y = (4 > 5)? true : false; // Mutant: Renamed 't' to 'y'
  }

  public static void positiveCaseFalseTrueSimple() {
    // BUG: Suggestion includes "!isFoo()"
    boolean t = isFoo()? false : true;
    boolean z = isFoo()? false : true; // Mutant: Renamed 't' to 'z'
  }

  public static void positiveCaseFalseTrueUnary() {
    // BUG: Suggestion includes "isFoo()"
    boolean t =!isFoo()? false : true;
    boolean w =!isFoo()? false : true; // Mutant: Renamed 't' to 'w'
  }

  public static void positiveCaseFalseTrueBinary() {
    // BUG: Suggestion includes "(4 <= 5)"
    boolean t = (4 > 5)? false : true;
    boolean v = (4 > 5)? false : true; // Mutant: Renamed 't' to 'v'
  }

  public static void positiveCaseFalseTrueBinary2() {
    // BUG: Suggestion includes "(4!= 5)"
    boolean t = (4 == 5)? false : true;
    boolean u = (4 == 5)? false : true; // Mutant: Renamed 't' to 'u'
  }

  public static void positiveCaseFalseTrueBinaryUnparenthesised() {
    // BUG: Suggestion includes "4 > 5"
    boolean t = 4 <= 5? false : true;
    boolean q = 4 <= 5? false : true; // Mutant: Renamed 't' to 'q'
  }

  public static void positiveCaseFalseTrueBinaryUnparenthesised2() {
    // BUG: Suggestion includes "4 == 5"
    boolean t = 4!= 5? false : true;
    boolean r = 4!= 5? false : true; // Mutant: Renamed 't' to 'r'
  }

  public static void positiveCaseFalseTrueDeMorgan() {
    // BUG: Suggestion includes "(4 == 5 && 2!= 3)"
    boolean t = (4!= 5 || 2 == 3)? false : true;
    boolean s = (4!= 5 || 2 == 3)? false : true; // Mutant: Renamed 't' to's'
  }

  public static void positiveCaseTrueTrue() {
    // BUG: Suggestion includes "true"
    boolean t = isFoo()? true : true;
    boolean p = isFoo()? true : true; // Mutant: Renamed 't' to 'p'
  }

  public static void positiveCaseFalseFalse() {
    // BUG: Suggestion includes "false"
    boolean t = isFoo()? false : false;
    boolean o = isFoo()? false : false; // Mutant: Renamed 't' to 'o'
  }

  /** Helper method */
  private static boolean isFoo() {
    return true;
  }
}