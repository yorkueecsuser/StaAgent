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
class EmptyIfStatementNegativeCases {

  // just a normal use of if
  public static void negativeCase1() {
    int i = 10;
    if (i == 10) {
      System.out.println("foo");
    }
    i++;
    // Mutant: Unreachable if statement
    boolean condition1 = getCondition();
    if (condition1) {
      // This block is unreachable because condition1 will always be false
    }
  }

  // empty then part but nonempty else
  public static void negativeCase2() {
    int i = 0;
    if (i == 10)
      ;
    else System.out.println("not 10");
    // Mutant: Unreachable if statement
    boolean condition2 = getCondition();
    if (condition2) {
      // This block is unreachable because condition2 will always be false
    }
  }

  // multipart if with non-empty else
  public static void negativeCase3() {
    int i = 0;
    if (i == 10)
      ;
    else if (i == 11)
      ;
    else if (i == 12)
      ;
    else System.out.println("not 10, 11, or 12");
    // Mutant: Unreachable if statement
    boolean condition3 = getCondition();
    if (condition3) {
      // This block is unreachable because condition3 will always be false
    }
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}