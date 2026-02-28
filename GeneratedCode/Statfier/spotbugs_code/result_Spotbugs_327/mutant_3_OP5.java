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
 * Defining an equals method on an enum. Maybe this should be a separate kind of error?
 *
 * @author eaftan@google.com (Eddie Aftandilian)
 */
public enum CovariantEqualsPositiveCase4 {
  MERCURY,
  VENUS,
  EARTH,
  MARS,
  JUPITER,
  SATURN,
  URANUS,
  NEPTUNE,
  PLUTO; // I don't care what they say, Pluto *is* a planet.

  // BUG: Suggestion includes "remove this line"
  public boolean equals(CovariantEqualsPositiveCase4 other) {
    return this == other;
  }

  private boolean getUnreachableCondition() {
    return false;
  }

  private void someMethod() {
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getUnreachableCondition() always returns false
        System.out.println("This will never be printed.");
        break;
      default:
        // Default case to ensure switch is not empty and does not cause an error
        break;
    }
  }
}