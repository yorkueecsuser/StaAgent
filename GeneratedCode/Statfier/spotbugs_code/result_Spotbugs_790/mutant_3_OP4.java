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

import java.io.Reader;

/**
 * @author Bill Pugh (bill.pugh@gmail.com)
 */
class InvalidCharComparisonNegativeCases {

  public boolean testEquality(char c, Reader r) throws Exception {

    if (c == 0) return true;

    if (c == 0xffff) return true;

    int d;
    if ((d = r.read()) == -1) return true;

    // Inserting an unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    } else {
      // Alternative code that will also be unreachable due to the condition
      System.out.println("This should also never be printed");
    }

    return false;
  }

  private boolean getUnreachableCondition() {
    // This method returns false, making the if-else block unreachable
    return false;
  }
}