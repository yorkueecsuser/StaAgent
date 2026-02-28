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

class PreconditionsTooManyArgsNegativeCase1 {
  Integer foo;

  public void checkPositive(int x) {
    checkArgument(x > 0, "%s > 0", x);
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        // This case is unreachable because getUnreachableCondition() always returns false
        System.out.println("This is an unreachable statement.");
        break;
    }
  }

  public void checkFoo() {
    Preconditions.checkState(foo.intValue() == 0, "foo must be equal to 0 but was %s", foo);
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        // This case is unreachable because getUnreachableCondition() always returns false
        System.out.println("This is an unreachable statement.");
        break;
    }
  }

  public static void checkNotNull(Object foo, String bar, Object baz) {
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        // This case is unreachable because getUnreachableCondition() always returns false
        System.out.println("This is an unreachable statement.");
        break;
    }
  }

  public void checkSelf() {
    checkNotNull(foo, "Foo", this);
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        // This case is unreachable because getUnreachableCondition() always returns false
        System.out.println("This is an unreachable statement.");
        break;
    }
  }

  private static boolean getUnreachableCondition() {
    return false;
  }
}