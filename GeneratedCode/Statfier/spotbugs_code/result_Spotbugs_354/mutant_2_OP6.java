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

import javax.annotation.CheckReturnValue;

/**
 * @author eaftan@google.com (Eddie Aftandilian)
 */
class CheckReturnValuePositiveCases {

  IntValue intValue = new IntValue(0);

  @CheckReturnValue
  private int increment(int bar) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is always false
    }
    return bar + 1;
  }

  public void foo() {
    int i = 1;
    // BUG: Suggestion includes "remove this line"
    increment(i);
    System.out.println(i);
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is always false
    }
  }

  public void bar() {
    // BUG: Suggestion includes "this.intValue = this.intValue.increment()"
    this.intValue.increment();
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is always false
    }
  }

  public void testIntValue() {
    IntValue value = new IntValue(10);
    // BUG: Suggestion includes "value = value.increment()"
    value.increment();
    boolean conditionFor = getCondition();
    for (int l = 0; conditionFor; l++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is always false
    }
  }

  private class IntValue {
    final int i;

    public IntValue(int i) {
      this.i = i;
    }

    @CheckReturnValue
    public IntValue increment() {
      boolean conditionFor = getCondition();
      for (int m = 0; conditionFor; m++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is always false
      }
      return new IntValue(i + 1);
    }

    public void increment2() {
      // BUG: Suggestion includes "remove this line"
      this.increment();
      boolean conditionFor = getCondition();
      for (int n = 0; conditionFor; n++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is always false
      }
    }

    public void increment3() {
      // BUG: Suggestion includes "remove this line"
      increment();
      boolean conditionFor = getCondition();
      for (int o = 0; conditionFor; o++) { // Unreachable for loop
        // This loop is unreachable because conditionFor is always false
      }
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the loops are unreachable
  }
}