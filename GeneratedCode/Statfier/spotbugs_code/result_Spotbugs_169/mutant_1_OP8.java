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
  String x = "thing"; // Renamed 'a' to 'x'

  { // String methods
    // BUG: Suggestion includes "remove this line"
    String.format("%d", 10);
    // BUG: Suggestion includes "remove this line"
    String.format("%d", 10).trim();
    // BUG: Suggestion includes "remove this line"
    java.lang.String.format("%d", 10).trim();
    // BUG: Suggestion includes "x = x.intern()"
    x.intern();
    // BUG: Suggestion includes "x = x.trim()"
    x.trim();
    // BUG: Suggestion includes "x = x.trim().concat("b")"
    x.trim().concat("b");
    // BUG: Suggestion includes "x = x.concat("append this")"
    x.concat("append this");
    // BUG: Suggestion includes "x = x.replace('t', 'b')"
    x.replace('t', 'b');
    // BUG: Suggestion includes "x = x.replace("thi", "fli")"
    x.replace("thi", "fli");
    // BUG: Suggestion includes "x = x.replaceAll("i", "b")"
    x.replaceAll("i", "b");
    // BUG: Suggestion includes "x = x.replaceFirst("a", "b")"
    x.replaceFirst("a", "b");
    // BUG: Suggestion includes "x = x.toLowerCase()"
    x.toLowerCase();
    // BUG: Suggestion includes "x = x.toLowerCase(Locale.ENGLISH)"
    x.toLowerCase(Locale.ENGLISH);
    // BUG: Suggestion includes "x = x.toUpperCase()"
    x.toUpperCase();
    // BUG: Suggestion includes "x = x.toUpperCase(Locale.ENGLISH)"
    x.toUpperCase(Locale.ENGLISH);
    // BUG: Suggestion includes "x = x.substring(0)"
    x.substring(0);
    // BUG: Suggestion includes "x = x.substring(0, 1)"
    x.substring(0, 1);
  }

  StringBuffer y = new StringBuffer("hello"); // Renamed'sb' to 'y'

  {
    // BUG: Suggestion includes "remove this line"
    y.toString().trim();
  }

  BigInteger z = new BigInteger("123456789"); // Renamed 'b' to 'z'

  { // BigInteger methods
    // BUG: Suggestion includes "z = z.add(new BigInteger("3"))"
    z.add(new BigInteger("3"));
    // BUG: Suggestion includes "z = z.abs()"
    z.abs();
    // BUG: Suggestion includes "z = z.shiftLeft(3)"
    z.shiftLeft(3);
    // BUG: Suggestion includes "z = z.subtract(BigInteger.TEN)"
    z.subtract(BigInteger.TEN);
  }

  BigDecimal w = new BigDecimal("1234.5678"); // Renamed 'c' to 'w'

  { // BigDecimal methods
    // BUG: Suggestion includes "w = w.add(new BigDecimal("1.3"))"
    w.add(new BigDecimal("1.3"));
    // BUG: Suggestion includes "w = w.abs()"
    w.abs();
    // BUG: Suggestion includes "w = w.divide(new BigDecimal("4.5"))"
    w.divide(new BigDecimal("4.5"));
    // BUG: Suggestion includes "remove this line"
    new BigDecimal("10").add(w);
  }
}