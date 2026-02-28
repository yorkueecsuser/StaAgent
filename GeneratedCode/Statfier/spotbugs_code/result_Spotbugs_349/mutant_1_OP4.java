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
 * @author Bill Pugh (bill.pugh@gmail.com)
 */
class InvalidSignedBytePositiveCases {

  public boolean testEquality(byte[] b, byte x) {

    // BUG: Suggestion includes "x == -1"
    if (x == 255) return true;
    // BUG: Suggestion includes "x == 1"
    if (x == -255) return true;
    // BUG: Suggestion includes "x == -128"
    if (x == 128) return true;
    // BUG: Suggestion includes "x!= -1"
    if (x!= 255) return true;

    // BUG: Suggestion includes "b[0] == -1"
    if (b[0] == 255) return true;
    // BUG: Suggestion includes "b[0] == -128"
    if (b[0] == 128) return true;
    // BUG: Suggestion includes "b[0] == 1"
    if (b[0] == -255) return true;

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block.");
    } else {
      // Alternative code that also never executes due to the same reason
      System.out.println("This is another unreachable block.");
    }

    return false;
  }

  private boolean getCondition() {
    // Always return false to ensure the if-else block is unreachable
    return false;
  }
}