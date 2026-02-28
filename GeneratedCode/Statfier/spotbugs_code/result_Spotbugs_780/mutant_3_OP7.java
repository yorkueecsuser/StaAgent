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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  // empty then part but nonempty else
  public static void negativeCase2() {
    int i = 0;
    if (i == 10)
      ;
    else System.out.println("not 10");
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  // Method to provide a dynamic condition for the while loop
  private static boolean getCondition() {
    return false; // This method always returns false, making the while loop unreachable
  }
}