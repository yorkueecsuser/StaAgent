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

import com.google.common.base.Objects;

/**
 * @author alexeagle@google.com (Alex Eagle)
 */
class SelfEqualsPositiveCase1 {
  private String field = "";

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass()!= o.getClass()) {
      return false;
    }
    SelfEqualsPositiveCase1 other = (SelfEqualsPositiveCase1) o;
    boolean retVal;
    // BUG: Suggestion includes "Objects.equal(field, other.field)"
    retVal = Objects.equal(field, field);
    // BUG: Suggestion includes "Objects.equal(other.field, this.field)"
    retVal &= Objects.equal(field, this.field);
    // BUG: Suggestion includes "Objects.equal(this.field, other.field)"
    retVal &= Objects.equal(this.field, field);
    // BUG: Suggestion includes "Objects.equal(this.field, other.field)"
    retVal &= Objects.equal(this.field, this.field);

    // Unreachable if-else statement mutation
    boolean condition = getCondition();
    if (condition) {
      retVal = false; // This will never be reached because condition is always false
    } else {
      retVal = true;  // This will always be executed
    }

    return retVal;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(field);
  }

  public static void test() {
    ForTesting tester = new ForTesting();
    // BUG: Suggestion includes "Objects.equal(tester.testing.testing, tester.testing)"
    Objects.equal(tester.testing.testing, tester.testing.testing);

    // Unreachable if-else statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed"); // This will never be reached because condition is always false
    } else {
      System.out.println("This will always be printed"); // This will always be executed
    }
  }

  private static class ForTesting {
    public ForTesting testing;
    public String string;
  }

  private static boolean getCondition() {
    return false; // Always returns false, making the if branch unreachable
  }
}