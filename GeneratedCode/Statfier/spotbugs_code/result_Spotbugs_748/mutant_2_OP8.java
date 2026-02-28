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
    // BUG: Suggestion includes "if (i == 10) {"
    if (i == 10)
      ;
    {
      i++;
    }

    // Mutant code
    int a = 20;
    if (a == 20)
      ;
    {
      a++;
    }
  }

  public static void positiveCase2() {
    int i = 10;
    // BUG: Suggestion includes "if (i == 10)"
    if (i == 10)
      ;
    i++;
    System.out.println("foo");

    // Mutant code
    int b = 20;
    if (b == 20)
      ;
    b++;
    System.out.println("bar");
  }

  public static void positiveCase3() {
    int i = 10;
    if (i == 10)
      // BUG: Suggestion includes "remove this line"
      ;
    i++;
    System.out.println("foo");

    // Mutant code
    int c = 20;
    if (c == 20)
      ;
    c++;
    System.out.println("baz");
  }

  public static void positiveCase4() {
    int i = 10;
    // BUG: Suggestion includes "remove this line"
    if (i == 10)
      ;

    // Mutant code
    int d = 20;
    if (d == 20)
      ;
  }

  public static void positiveCase5() {
    int i = 10;
    if (i == 10)
      // BUG: Suggestion includes "remove this line"
      ;
    {
      System.out.println("foo");
    }

    // Mutant code
    int e = 20;
    if (e == 20)
      ;
    {
      System.out.println("qux");
    }
  }
}