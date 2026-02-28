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
 * Positive test cases for the empty if statement check.
 *
 * @author eaftan@google.com (Eddie Aftandilian)
 */
class EmptyIfStatementPositiveCases {

  public static void positiveCase1() {
    int i = 10;
    int x = 20; // Added variable for mutation
    // BUG: Suggestion includes "if (i == 10) {"
    if (i == 10)
      ;
    {
      i++;
    }
    // Mutated code
    if (x == 20)
      ;
    {
      x++;
    }
  }

  public static void positiveCase2() {
    int i = 10;
    int y = 30; // Added variable for mutation
    // BUG: Suggestion includes "if (i == 10)"
    if (i == 10)
      ;
    i++;
    System.out.println("foo");
    // Mutated code
    if (y == 30)
      ;
    y++;
    System.out.println("bar");
  }

  public static void positiveCase3() {
    int i = 10;
    int z = 40; // Added variable for mutation
    if (i == 10)
      // BUG: Suggestion includes "remove this line"
      ;
    i++;
    System.out.println("foo");
    // Mutated code
    if (z == 40)
      ;
    z++;
    System.out.println("baz");
  }

  public static void positiveCase4() {
    int i = 10;
    int w = 50; // Added variable for mutation
    // BUG: Suggestion includes "remove this line"
    if (i == 10)
      ;
    // Mutated code
    if (w == 50)
      ;
    w++;
  }

  public static void positiveCase5() {
    int i = 10;
    int v = 60; // Added variable for mutation
    if (i == 10)
      // BUG: Suggestion includes "remove this line"
      ;
    {
      System.out.println("foo");
    }
    // Mutated code
    if (v == 60)
      ;
    {
      System.out.println("qux");
    }
  }
}