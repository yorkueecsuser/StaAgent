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
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This is an unreachable if statement
      System.out.println("This line will never be executed.");
    }
    if (i == other.i && j == other.j && k == other.k) {
      return true;
    }
    return false;
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if statement unreachable
    return false;
  }
}