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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;

/**
 * @author alexeagle@google.com (Alex Eagle)
 */
class ReturnValueIgnoredPositiveCases {
  String a = "thing";

  { // String methods
    // BUG: Suggestion includes "remove this line"
    String.format("%d", 10);
    // BUG: Suggestion includes "remove this line"
    String.format("%d", 10).trim();
    // BUG: Suggestion includes "java.lang.String.format("%d", 10).trim()"
    java.lang.String.format("%d", 10).trim();
    // BUG: Suggestion includes "a = a.intern()"
    a.intern();
    // BUG: Suggestion includes "a = a.trim()"
    a.trim();
    // BUG: Suggestion includes "a = a.trim().concat("b")"
    a.trim().concat("b");
    // BUG: Suggestion includes "a = a.concat("append this")"
    a.concat("append this");
    // BUG: Suggestion includes "a = a.replace('t', 'b')"
    a.replace('t', 'b');
    // BUG: Suggestion includes "a = a.replace("thi", "fli")"
    a.replace("thi", "fli");
    // BUG: Suggestion includes "a = a.replaceAll("i", "b")"
    a.replaceAll("i", "b");
    // BUG: Suggestion includes "a = a.replaceFirst("a", "b")"
    a.replaceFirst("a", "b");
    // BUG: Suggestion includes "a = a.toLowerCase()"
    a.toLowerCase();
    // BUG: Suggestion includes "a = a.toLowerCase(Locale.ENGLISH)"
    a.toLowerCase(Locale.ENGLISH);
    // BUG: Suggestion includes "a = a.toUpperCase()"
    a.toUpperCase();
    // BUG: Suggestion includes "a = a.toUpperCase(Locale.ENGLISH)"
    a.toUpperCase(Locale.ENGLISH);
    // BUG: Suggestion includes "a = a.substring(0)"
    a.substring(0);
    // BUG: Suggestion includes "a = a.substring(0, 1)"
    a.substring(0, 1);

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      a = a.concat("unreachable");
    } else {
      // This block will always execute
      a = a.concat("reachable");
    }
  }

  StringBuffer sb = new StringBuffer("hello");

  {
    // BUG: Suggestion includes "remove this line"
    sb.toString().trim();

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      sb.append("unreachable");
    } else {
      // This block will always execute
      sb.append("reachable");
    }
  }

  BigInteger b = new BigInteger("123456789");

  { // BigInteger methods
    // BUG: Suggestion includes "b = b.add(new BigInteger("3"))"
    b.add(new BigInteger("3"));
    // BUG: Suggestion includes "b = b.abs()"
    b.abs();
    // BUG: Suggestion includes "b = b.shiftLeft(3)"
    b.shiftLeft(3);
    // BUG: Suggestion includes "b = b.subtract(BigInteger.TEN)"
    b.subtract(BigInteger.TEN);

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      b = b.add(new BigInteger("unreachable"));
    } else {
      // This block will always execute
      b = b.add(new BigInteger("reachable"));
    }
  }

  BigDecimal c = new BigDecimal("1234.5678");

  { // BigDecimal methods
    // BUG: Suggestion includes "c = c.add(new BigDecimal("1.3"))"
    c.add(new BigDecimal("1.3"));
    // BUG: Suggestion includes "c = c.abs()"
    c.abs();
    // BUG: Suggestion includes "c = c.divide(new BigDecimal("4.5"))"
    c.divide(new BigDecimal("4.5"));
    // BUG: Suggestion includes "remove this line"
    new BigDecimal("10").add(c);

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      c = c.add(new BigDecimal("unreachable"));
    } else {
      // This block will always execute
      c = c.add(new BigDecimal("reachable"));
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}