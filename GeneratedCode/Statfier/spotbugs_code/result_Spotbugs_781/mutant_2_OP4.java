/*
 * Copyright 2011 Google Inc. All Rights Reserved.
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
 * @author eaftan@google.com (Eddie Aftandilian)
 */
class EmptyStatementNegativeCases {

  public static void negativeCase1() {
    int i = 10;
    if (i == 10) {
      System.out.println("foo");
    }
    i++;

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      System.out.println("This is an unreachable else block");
    }
  }

  public static void negativeCase2() {
    int i = 0;
    for (; ; ) {
      if (i > 10) {
        break;
      }
      i++;
    }

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      System.out.println("This is another unreachable else block");
    }
  }

  // Helper method to return a condition that is always false
  private static boolean getCondition() {
    return false;
  }
}