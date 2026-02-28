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
    int[] c = {1, 2, 3};

    // BUG: Suggestion includes "Arrays.equals(a, b)"
    if (a.equals(c)) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }

  public void objectArray() {
    Object[] x = new Object[3];
    Object[] y = new Object[3];

    // BUG: Suggestion includes "Arrays.equals(a, b)"
    if (x.equals(y)) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }

  public void firstMethodCall() {
    String z = "hello";
    char[] d = new char[3];

    // BUG: Suggestion includes "Arrays.equals(s.toCharArray(), b)"
    if (z.toCharArray().equals(d)) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }

  public void secondMethodCall() {
    char[] e = new char[3];
    String f = "hello";

    // BUG: Suggestion includes "Arrays.equals(a, s.toCharArray())"
    if (e.equals(f.toCharArray())) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }

  public void bothMethodCalls() {
    String g = "hello";
    String h = "world";

    // BUG: Suggestion includes "Arrays.equals(s1.toCharArray(), s2.toCharArray())"
    if (g.toCharArray().equals(h.toCharArray())) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }
}