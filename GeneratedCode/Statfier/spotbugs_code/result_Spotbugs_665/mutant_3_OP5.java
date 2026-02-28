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

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        result += 100;
        break;
      case 1:
        // This is the only reachable case
        result += 200;
        break;
    }

    return result;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement's first case unreachable
    return false;
  }
}