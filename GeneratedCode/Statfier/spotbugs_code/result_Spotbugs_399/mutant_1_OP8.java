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
 * @author eaftan@google.com (Eddie Aftandilian)
 */
class ArrayEqualsPositiveCases {

  public void intArray() {
    int[] a = {1, 2, 3};
    int[] c = {1, 2, 3}; // Mutated variable name from 'b' to 'c'

    // BUG: Suggestion includes "Arrays.equals(a, b)"
    if (a.equals(c)) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }

  public void objectArray() {
    Object[] d = new Object[3]; // Mutated variable name from 'a' to 'd'
    Object[] b = new Object[3];

    // BUG: Suggestion includes "Arrays.equals(a, b)"
    if (d.equals(b)) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }

  public void firstMethodCall() {
    String e = "hello"; // Mutated variable name from's' to 'e'
    char[] b = new char[3];

    // BUG: Suggestion includes "Arrays.equals(s.toCharArray(), b)"
    if (e.toCharArray().equals(b)) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }

  public void secondMethodCall() {
    char[] a = new char[3];
    String f = "hello"; // Mutated variable name from's' to 'f'

    // BUG: Suggestion includes "Arrays.equals(a, s.toCharArray())"
    if (a.equals(f.toCharArray())) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }

  public void bothMethodCalls() {
    String g = "hello"; // Mutated variable name from's1' to 'g'
    String s2 = "world";

    // BUG: Suggestion includes "Arrays.equals(s1.toCharArray(), s2.toCharArray())"
    if (g.toCharArray().equals(s2.toCharArray())) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }
}