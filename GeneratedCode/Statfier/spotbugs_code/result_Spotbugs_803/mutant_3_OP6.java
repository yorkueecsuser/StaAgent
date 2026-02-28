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
 * Negative cases for {@code UnneededConditionalOperator}.
 *
 * @author sjnickerson@google.com (Simon Nickerson)
 */
class UnneededConditionalOperatorNegativeCases {

  public static void negativeCase1() {
    boolean t = (4 > 5)? true : isFoo();
    // Unreachable for loop mutant
    boolean conditionFor1 = getCondition();
    for (int i = 0; conditionFor1; i++) {
      // This loop is unreachable
    }
  }

  public static void negativeCase2() {
    boolean t = (4 > 5)? isFoo() : true;
    // Unreachable for loop mutant
    boolean conditionFor2 = getCondition();
    for (int i = 0; conditionFor2; i++) {
      // This loop is unreachable
    }
  }

  public static void negativeCase3() {
    String t = isFoo()? "true" : "false";
    // Unreachable for loop mutant
    boolean conditionFor3 = getCondition();
    for (int i = 0; conditionFor3; i++) {
      // This loop is unreachable
    }
  }

  private static boolean isFoo() {
    return true;
  }

  private static boolean getCondition() {
    return false; // This ensures the condition is always false, making the loop unreachable
  }
}