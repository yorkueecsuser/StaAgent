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
    return bar + 1;
  }

  public void foo() {
    int i = 1;
    // BUG: Suggestion includes "remove this line"
    increment(i);
    System.out.println(i);
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable
    }
  }

  public void bar() {
    // BUG: Suggestion includes "this.intValue = this.intValue.increment()"
    this.intValue.increment();
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // This loop is unreachable
    }
  }

  public void testIntValue() {
    IntValue value = new IntValue(10);
    // BUG: Suggestion includes "value = value.increment()"
    value.increment();
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int l = 0; conditionFor; l++) {
      // This loop is unreachable
    }
  }

  private class IntValue {
    final int i;

    public IntValue(int i) {
      this.i = i;
    }

    @CheckReturnValue
    public IntValue increment() {
      return new IntValue(i + 1);
    }

    public void increment2() {
      // BUG: Suggestion includes "remove this line"
      this.increment();
      // Unreachable for loop mutant
      boolean conditionFor = getCondition();
      for (int m = 0; conditionFor; m++) {
        // This loop is unreachable
      }
    }

    public void increment3() {
      // BUG: Suggestion includes "remove this line"
      increment();
      // Unreachable for loop mutant
      boolean conditionFor = getCondition();
      for (int n = 0; conditionFor; n++) {
        // This loop is unreachable
      }
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}