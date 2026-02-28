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
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = false;
    }

    // BUG: Suggestion includes "!x.equals(y)"
    retVal = (x!= y);
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = true;
    }

    // BUG: Suggestion includes "(x + y).equals(y + x)"
    retVal = (x + y == y + x);
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = false;
    }

    // BUG: Suggestion includes "!(x + y).equals(y + x)"
    retVal = (x + y!= y + x);
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = true;
    }

    // BUG: Suggestion includes "(x + "str").equals(y + "str")"
    retVal = (x + "str" == y + "str");
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = false;
    }

    // BUG: Suggestion includes "!(x + "str").equals(y + "str")"
    retVal = (x + "str"!= y + "str");
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = true;
    }

    // BUG: Suggestion includes ""str".equals(x)"
    retVal = ("str" == x);
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = false;
    }

    // BUG: Suggestion includes ""str".equals(x)"
    retVal = (x == "str");
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = true;
    }

    // BUG: Suggestion includes ""str2".equals("str")"
    retVal = ("str2" == "str");
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = false;
    }

    final String constValue = "str";
    // BUG: Suggestion includes "constValue.equals(x)"
    retVal = (x == constValue);
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = false;
    }

    // BUG: Suggestion includes "!constValue.equals(x)"
    retVal = (x!= constValue);
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = true;
    }

    // BUG: Suggestion includes "(x + y + constValue).equals(x + y)"
    retVal = (x + y + constValue == x + y);
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = false;
    }

    final String constValue2 = "str2";
    // BUG: Suggestion includes "(constValue + constValue2).equals(x)"
    retVal = (constValue + constValue2 == x);
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = false;
    }

    // BUG: Suggestion includes "(constValue + constValue2).equals(x)"
    retVal = (x == constValue + constValue2);
    // Inserting unreachable while loop
    conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      retVal = true;
    }

    return retVal;
  }

  private boolean getCondition() {
    return false;
  }
}