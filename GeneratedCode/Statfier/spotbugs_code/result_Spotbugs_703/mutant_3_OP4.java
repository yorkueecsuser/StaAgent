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

import static com.google.common.base.Preconditions.checkArgument;

import com.google.common.base.Preconditions;

class PreconditionsTooManyArgsPositiveCase1 {
  int foo;

  public void checkPositive(int x) {
    // BUG: Suggestion includes "%s > 0"
    checkArgument(x > 0, "%d > 0", x);

    // Unreachable if-else statement mutation
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      System.out.println("This else block is unreachable");
    }
  }

  public void checkFoo() {
    // BUG: Suggestion includes "foo must be equal to 0 but was %s"
    Preconditions.checkState(foo == 0, "foo must be equal to 0 but was {0}", foo);

    // Unreachable if-else statement mutation
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      System.out.println("This else block is unreachable");
    }
  }

  private boolean getCondition() {
    return false;
  }
}