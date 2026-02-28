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

  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 0;
  }

  public void someMethod() {
    boolean condition = getCondition();
    int value = getValue();

    if (condition) {
      // Some code
    }

    while (condition) {
      // Some code
    }

    for (int i = 0; condition; i++) {
      // Some code
    }

    if (condition) {
      // Some code
    } else {
      // Alternative code
    }

    // Unreachable switch statement
    switch (value) {
      case 1:
        // Some code
        break;
      case 2:
        // Some code
        break;
      default:
        // Some code
        break;
    }
  }
}