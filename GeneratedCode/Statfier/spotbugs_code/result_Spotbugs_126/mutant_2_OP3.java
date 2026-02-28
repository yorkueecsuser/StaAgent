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
class InvalidSignedByteNegativeCases {

  public boolean testEquality(byte[] b, byte x) {
    // Original code starts
    if (x == 1) return true;
    if (x == -2) return true;
    if (x == 127) return true;
    if (x!= 1) return true;

    if (b[0] == 1) return true;
    if (b[0] == -2) return true;
    if (b[0] == -127) return true;

    return false;
    // Original code ends

    // Inserted unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      if (x == 0) return true;
    }
  }

  private boolean getCondition() {
    return false;
  }
}