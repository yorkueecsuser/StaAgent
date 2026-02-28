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
    // Unreachable for loop
    boolean conditionFor1 = getCondition();
    for (int i = 0; conditionFor1; i++) {
      // This loop is unreachable
    }
  }

  public static void positiveCaseTrueFalseBinary() {
    // BUG: Suggestion includes "(4 > 5)"
    boolean t = (4 > 5)? true : false;
    // Unreachable for loop
    boolean conditionFor2 = getCondition();
    for (int i = 0; conditionFor2; i++) {
      // This loop is unreachable
    }
  }

  public static void positiveCaseFalseTrueSimple() {
    // BUG: Suggestion includes "!isFoo()"
    boolean t = isFoo()? false : true;
    // Unreachable for loop
    boolean conditionFor3 = getCondition();
    for (int i = 0; conditionFor3; i++) {
      // This loop is unreachable
    }
  }

  public static void positiveCaseFalseTrueUnary() {
    // BUG: Suggestion includes "isFoo()"
    boolean t =!isFoo()? false : true;
    // Unreachable for loop
    boolean conditionFor4 = getCondition();
    for (int i = 0; conditionFor4; i++) {
      // This loop is unreachable
    }
  }

  public static void positiveCaseFalseTrueBinary() {
    // BUG: Suggestion includes "(4 <= 5)"
    boolean t = (4 > 5)? false : true;
    // Unreachable for loop
    boolean conditionFor5 = getCondition();
    for (int i = 0; conditionFor5; i++) {
      // This loop is unreachable
    }
  }

  public static void positiveCaseFalseTrueBinary2() {
    // BUG: Suggestion includes "(4!= 5)"
    boolean t = (4 == 5)? false : true;
    // Unreachable for loop
    boolean conditionFor6 = getCondition();
    for (int i = 0; conditionFor6; i++) {
      // This loop is unreachable
    }
  }

  public static void positiveCaseFalseTrueBinaryUnparenthesised() {
    // BUG: Suggestion includes "4 > 5"
    boolean t = 4 <= 5? false : true;
    // Unreachable for loop
    boolean conditionFor7 = getCondition();
    for (int i = 0; conditionFor7; i++) {
      // This loop is unreachable
    }
  }

  public static void positiveCaseFalseTrueBinaryUnparenthesised2() {
    // BUG: Suggestion includes "4 == 5"
    boolean t = 4!= 5? false : true;
    // Unreachable for loop
    boolean conditionFor8 = getCondition();
    for (int i = 0; conditionFor8; i++) {
      // This loop is unreachable
    }
  }

  public static void positiveCaseFalseTrueDeMorgan() {
    // BUG: Suggestion includes "(4 == 5 && 2!= 3)"
    boolean t = (4!= 5 || 2 == 3)? false : true;
    // Unreachable for loop
    boolean conditionFor9 = getCondition();
    for (int i = 0; conditionFor9; i++) {
      // This loop is unreachable
    }
  }

  public static void positiveCaseTrueTrue() {
    // BUG: Suggestion includes "true"
    boolean t = isFoo()? true : true;
    // Unreachable for loop
    boolean conditionFor10 = getCondition();
    for (int i = 0; conditionFor10; i++) {
      // This loop is unreachable
    }
  }

  public static void positiveCaseFalseFalse() {
    // BUG: Suggestion includes "false"
    boolean t = isFoo()? false : false;
    // Unreachable for loop
    boolean conditionFor11 = getCondition();
    for (int i = 0; conditionFor11; i++) {
      // This loop is unreachable
    }
  }

  /** Helper method */
  private static boolean isFoo() {
    return true;
  }

  /** Method to provide a dynamic condition */
  private static boolean getCondition() {
    return false;
  }
}