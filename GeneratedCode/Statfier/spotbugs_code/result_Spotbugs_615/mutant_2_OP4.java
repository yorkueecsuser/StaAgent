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
 * @author Eddie Aftandilian(eaftan@google.com)
 */
class CovariantEqualsPositiveCase2 {
  int i, j, k;

  // BUG: Suggestion includes "Did you mean '@Override'"
  public boolean equals(CovariantEqualsPositiveCase2 other) {
    if (i == other.i && j == other.j && k == other.k) {
      return true;
    }

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block.");
    } else {
      // This block will always execute
      System.out.println("This block will always execute.");
    }

    return false;
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}