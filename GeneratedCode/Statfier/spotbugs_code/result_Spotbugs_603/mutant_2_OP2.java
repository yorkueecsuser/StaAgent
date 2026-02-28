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
    boolean u = isFoo()? true : false; // Mutant
  }

  public static void positiveCaseTrueFalseBinary() {
    // BUG: Suggestion includes "(4 > 5)"
    boolean t = (4 > 5)? true : false;
    boolean u = (4 > 5)? true : false; // Mutant
  }

  public static void positiveCaseFalseTrueSimple() {
    // BUG: Suggestion includes "!isFoo()"
    boolean t = isFoo()? false : true;
    boolean u = isFoo()? false : true; // Mutant
  }

  public static void positiveCaseFalseTrueUnary() {
    // BUG: Suggestion includes "isFoo()"
    boolean t =!isFoo()? false : true;
    boolean u =!isFoo()? false : true; // Mutant
  }

  public static void positiveCaseFalseTrueBinary() {
    // BUG: Suggestion includes "(4 <= 5)"
    boolean t = (4 > 5)? false : true;
    boolean u = (4 > 5)? false : true; // Mutant
  }

  public static void positiveCaseFalseTrueBinary2() {
    // BUG: Suggestion includes "(4!= 5)"
    boolean t = (4 == 5)? false : true;
    boolean u = (4 == 5)? false : true; // Mutant
  }

  public static void positiveCaseFalseTrueBinaryUnparenthesised() {
    // BUG: Suggestion includes "4 > 5"
    boolean t = 4 <= 5? false : true;
    boolean u = 4 <= 5? false : true; // Mutant
  }

  public static void positiveCaseFalseTrueBinaryUnparenthesised2() {
    // BUG: Suggestion includes "4 == 5"
    boolean t = 4!= 5? false : true;
    boolean u = 4!= 5? false : true; // Mutant
  }

  public static void positiveCaseFalseTrueDeMorgan() {
    // BUG: Suggestion includes "(4 == 5 && 2!= 3)"
    boolean t = (4!= 5 || 2 == 3)? false : true;
    boolean u = (4!= 5 || 2 == 3)? false : true; // Mutant
  }

  public static void positiveCaseTrueTrue() {
    // BUG: Suggestion includes "true"
    boolean t = isFoo()? true : true;
    boolean u = isFoo()? true : true; // Mutant
  }

  public static void positiveCaseFalseFalse() {
    // BUG: Suggestion includes "false"
    boolean t = isFoo()? false : false;
    boolean u = isFoo()? false : false; // Mutant
  }

  /** Helper method */
  private static boolean isFoo() {
    return true;
  }
}