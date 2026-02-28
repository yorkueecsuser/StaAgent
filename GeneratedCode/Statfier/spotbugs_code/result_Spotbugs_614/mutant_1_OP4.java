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
 * @author alexeagle@google.com (Alex Eagle)
 */
class CovariantEqualsPositiveCase1 {

  // BUG: Suggestion includes "Did you mean '@Override'"
  public boolean equals(CovariantEqualsPositiveCase1 other) {
    return false;
  }

  // Mutated code with an unreachable if-else statement
  public void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      // This is the unreachable if-else branch
      System.out.println("This will never run because shouldRun is always false.");
    }
  }

  private boolean getCondition() {
    return false; // Ensuring the condition is always false, making the else branch unreachable
  }
}