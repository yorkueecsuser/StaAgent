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
 * @author ptoomey@google.com (Patrick Toomey)
 */
class InvalidStringEqualityPositiveCases {

  public boolean testEquality(String x, String y) {
    boolean retVal;

    // BUG: Suggestion includes "x.equals(y)"
    retVal = (x == y);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      retVal =!retVal;
    }

    // BUG: Suggestion includes "!x.equals(y)"
    retVal = (x!= y);
    // BUG: Suggestion includes "(x + y).equals(y + x)"
    retVal = (x + y == y + x);
    // BUG: Suggestion includes "!(x + y).equals(y + x)"
    retVal = (x + y!= y + x);
    // BUG: Suggestion includes "(x + "str").equals(y + "str")"
    retVal = (x + "str" == y + "str");
    // BUG: Suggestion includes "!(x + "str").equals(y + "str")"
    retVal = (x + "str"!= y + "str");
    // BUG: Suggestion includes ""str".equals(x)"
    retVal = ("str" == x);
    // BUG: Suggestion includes ""str".equals(x)"
    retVal = (x == "str");
    // BUG: Suggestion includes ""str2".equals("str")"
    retVal = ("str2" == "str");
    final String constValue = "str";
    // BUG: Suggestion includes "constValue.equals(x)"
    retVal = (x == constValue);
    // BUG: Suggestion includes "!constValue.equals(x)"
    retVal = (x!= constValue);
    // BUG: Suggestion includes "(x + y + constValue).equals(x + y)"
    retVal = (x + y + constValue == x + y);
    final String constValue2 = "str2";
    // BUG: Suggestion includes "(constValue + constValue2).equals(x)"
    retVal = (constValue + constValue2 == x);
    // BUG: Suggestion includes "(constValue + constValue2).equals(x)"
    retVal = (x == constValue + constValue2);

    return retVal;
  }

  private boolean getCondition() {
    return false; // This will always return false, making the loop unreachable
  }
}