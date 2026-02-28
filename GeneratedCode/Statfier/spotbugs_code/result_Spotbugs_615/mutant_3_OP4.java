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
    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      System.out.println("This is an unreachable block.");
    } else {
      // This block will always be executed
      System.out.println("This block is always executed.");
    }
    return false;
  }

  private boolean getCondition() {
    // This method returns false, making the if block unreachable
    return false;
  }
}