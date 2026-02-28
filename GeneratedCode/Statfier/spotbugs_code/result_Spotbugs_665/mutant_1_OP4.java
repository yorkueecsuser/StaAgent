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
class BadShiftAmountPositiveCases {

  public long testEquality(int x) {

    long result = 0;

    // BUG: Suggestion includes "(long)x >> 32"
    result += x >> 32;
    // BUG: Suggestion includes "(long)x << 32"
    result += x << 32;
    // BUG: Suggestion includes "(long)x >>> 32"
    result += x >>> 32;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      result += 100; // This will never execute because shouldRun is always false
    } else {
      result += 200; // This will also never execute because shouldRun is always false
    }

    return result;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if-else unreachable
  }
}