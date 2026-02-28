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
 * @author adgar@google.com (Mike Edgar)
 */
class ArrayToStringPositiveCases {

  public void intArray() {
    int[] a = {1, 2, 3};
    int[] a_duplicate = {1, 2, 3}; // Duplicate assignment

    // BUG: Suggestion includes "Arrays.toString(a)"
    if (a.toString().isEmpty()) {
      System.out.println("int array string is empty!");
    } else {
      System.out.println("int array string is nonempty!");
    }
  }

  public void objectArray() {
    Object[] a = new Object[3];
    Object[] a_duplicate = new Object[3]; // Duplicate assignment

    // BUG: Suggestion includes "Arrays.toString(a)"
    if (a.toString().isEmpty()) {
      System.out.println("object array string is empty!");
    } else {
      System.out.println("object array string is nonempty!");
    }
  }

  public void firstMethodCall() {
    String s = "hello";
    String s_duplicate = "hello"; // Duplicate assignment

    // BUG: Suggestion includes "Arrays.toString(s.toCharArray())"
    if (s.toCharArray().toString().isEmpty()) {
      System.out.println("char array string is empty!");
    } else {
      System.out.println("char array string is nonempty!");
    }
  }

  public void secondMethodCall() {
    char[] a = new char[3];
    char[] a_duplicate = new char[3]; // Duplicate assignment

    // BUG: Suggestion includes "Arrays.toString(a)"
    if (a.toString().isEmpty()) {
      System.out.println("array string is empty!");
    } else {
      System.out.println("array string is nonempty!");
    }
  }
}