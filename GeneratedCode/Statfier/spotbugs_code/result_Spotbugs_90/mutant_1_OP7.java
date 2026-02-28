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
 * Tests for self assignment
 *
 * @author eaftan@google.com (Eddie Aftandilian)
 */
class SelfAssignmentPositiveCases1 {
  // TODO(eaftan): what happens with a static field that has the same name
  // as a local field?

  private int a;

  public void test1(int b) {
    // BUG: Suggestion includes "this.a = b"
    this.a = a;
    boolean conditionWhile1 = getCondition();
    while (conditionWhile1) {
      // Unreachable code
    }
  }

  public void test2(int b) {
    // BUG: Suggestion includes "remove this line"
    a = this.a;
    boolean conditionWhile2 = getCondition();
    while (conditionWhile2) {
      // Unreachable code
    }
  }

  public void test3() {
    int a = 0;
    // BUG: Suggestion includes "this.a = a"
    a = a;
    boolean conditionWhile3 = getCondition();
    while (conditionWhile3) {
      // Unreachable code
    }
  }

  public void test4() {
    // BUG: Suggestion includes "remove this line"
    this.a = this.a;
    boolean conditionWhile4 = getCondition();
    while (conditionWhile4) {
      // Unreachable code
    }
  }

  public void test5() {
    // BUG: Suggestion includes "this.a = a"
    if ((a = a)!= 10) {
      System.out.println("foo");
    }
    boolean conditionWhile5 = getCondition();
    while (conditionWhile5) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the loops unreachable
  }
}