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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        bar += 10;
      } else {
        bar -= 5;
      }
    }
    return bar + 1;
  }

  public void foo() {
    int i = 1;
    // BUG: Suggestion includes "remove this line"
    increment(i);
    System.out.println(i);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        i += 20;
      } else {
        i -= 10;
      }
    }
  }

  public void bar() {
    // BUG: Suggestion includes "this.intValue = this.intValue.increment()"
    this.intValue.increment();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        this.intValue = new IntValue(this.intValue.i + 10);
      } else {
        this.intValue = new IntValue(this.intValue.i - 5);
      }
    }
  }

  public void testIntValue() {
    IntValue value = new IntValue(10);
    // BUG: Suggestion includes "value = value.increment()"
    value.increment();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (getUnreachableCondition()) {
        value = new IntValue(value.i + 10);
      } else {
        value = new IntValue(value.i - 5);
      }
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
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
          this.i = i + 10; // This line will cause a compile error as 'i' is final
        } else {
          this.i = i - 5;  // This line will cause a compile error as 'i' is final
        }
      }
    }

    public void increment3() {
      // BUG: Suggestion includes "remove this line"
      increment();
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
          this.i = i + 10; // This line will cause a compile error as 'i' is final
        } else {
          this.i = i - 5;  // This line will cause a compile error as 'i' is final
        }
      }
    }
  }

  private boolean getCondition() {
    return true; // or any dynamic condition
  }

  private boolean getUnreachableCondition() {
    return false; // This method will always return false, making the if-else unreachable
  }
}