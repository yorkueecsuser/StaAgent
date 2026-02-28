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
    // Mutant
    int x = 2;
    increment(x);
    System.out.println(x);
  }

  public void bar() {
    // BUG: Suggestion includes "this.intValue = this.intValue.increment()"
    this.intValue.increment();
    // Mutant
    IntValue y = new IntValue(5);
    y.increment();
  }

  public void testIntValue() {
    IntValue value = new IntValue(10);
    // BUG: Suggestion includes "value = value.increment()"
    value.increment();
    // Mutant
    IntValue z = new IntValue(20);
    z.increment();
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
      // Mutant
      IntValue a = new IntValue(3);
      a.increment();
    }

    public void increment3() {
      // BUG: Suggestion includes "remove this line"
      increment();
      // Mutant
      IntValue b = new IntValue(4);
      b.increment();
    }
  }
}