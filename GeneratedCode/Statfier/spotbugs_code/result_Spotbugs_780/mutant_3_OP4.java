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
    // Inserting unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  // empty then part but nonempty else
  public static void negativeCase2() {
    int i = 0;
    if (i == 10)
      ;
    else System.out.println("not 10");
    // Inserting unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
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
    // Inserting unreachable if-else branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  // Method to provide a dynamically determined condition
  private static boolean getUnreachableCondition() {
    return false; // This method can be modified to return true in a real scenario, but here it's used to demonstrate the insertion of unreachable code.
  }
}