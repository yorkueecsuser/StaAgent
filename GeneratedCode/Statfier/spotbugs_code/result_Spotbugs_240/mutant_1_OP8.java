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

import com.google.common.base.Objects;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

/**
 * @author Bill Pugh (bill.pugh@gmail.com)
 */
class IncompatibleEqualsPositiveCases {

  @ExpectWarning(value = "EC", num = 7)
  public boolean testEquality(String s, Integer i, Double d, Object a[]) {

    // BUG: Suggestion includes "false"
    if (i.equals(17L)) return true;

    // BUG: Suggestion includes "false"
    if (s.equals(a)) return true;

    // BUG: Suggestion includes "false"
    if (a.equals(s)) return true;

    // BUG: Suggestion includes "false"
    if (i.equals((byte) 17)) return true;

    // BUG: Suggestion includes "false"
    if (s.equals(i)) return true;

    // BUG: Suggestion includes "false"
    if (i.equals(d)) return true;
    // BUG: Suggestion includes "false"
    if (d.equals(a)) return true;

    // Mutated code
    String x = s;
    Integer y = i;
    Double z = d;
    Object b[] = a;

    // BUG: Suggestion includes "false"
    if (y.equals(17L)) return true;

    // BUG: Suggestion includes "false"
    if (x.equals(b)) return true;

    // BUG: Suggestion includes "false"
    if (b.equals(x)) return true;

    // BUG: Suggestion includes "false"
    if (y.equals((byte) 17)) return true;

    // BUG: Suggestion includes "false"
    if (x.equals(y)) return true;

    // BUG: Suggestion includes "false"
    if (y.equals(z)) return true;
    // BUG: Suggestion includes "false"
    if (z.equals(b)) return true;

    return false;
  }

  @ExpectWarning(value = "EC", num = 7)
  public boolean testObjectsEquals(String s, Integer i, Double d, Object a[]) {

    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(i, 17L)) return true;

    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(s, a)) return true;

    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(a, s)) return true;

    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(i, (byte) 17)) return true;

    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(s, i)) return true;

    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(i, d)) return true;
    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(d, a)) return true;

    // Mutated code
    String x = s;
    Integer y = i;
    Double z = d;
    Object b[] = a;

    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(y, 17L)) return true;

    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(x, b)) return true;

    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(b, x)) return true;

    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(y, (byte) 17)) return true;

    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(x, y)) return true;

    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(y, z)) return true;
    // BUG: Suggestion includes "false"
    if (java.util.Objects.equals(z, b)) return true;

    return false;
  }

  @ExpectWarning(value = "EC", num = 7)
  public boolean testGuavaEquals(String s, Integer i, Double d, Object a[]) {

    // BUG: Suggestion includes "false"
    if (Objects.equal(i, 17L)) return true;

    // BUG: Suggestion includes "false"
    if (Objects.equal(s, a)) return true;

    // BUG: Suggestion includes "false"
    if (Objects.equal(a, s)) return true;

    // BUG: Suggestion includes "false"
    if (Objects.equal(i, (byte) 17)) return true;

    // BUG: Suggestion includes "false"
    if (Objects.equal(s, i)) return true;

    // BUG: Suggestion includes "false"
    if (Objects.equal(i, d)) return true;
    // BUG: Suggestion includes "false"
    if (Objects.equal(d, a)) return true;

    // Mutated code
    String x = s;
    Integer y = i;
    Double z = d;
    Object b[] = a;

    // BUG: Suggestion includes "false"
    if (Objects.equal(y, 17L)) return true;

    // BUG: Suggestion includes "false"
    if (Objects.equal(x, b)) return true;

    // BUG: Suggestion includes "false"
    if (Objects.equal(b, x)) return true;

    // BUG: Suggestion includes "false"
    if (Objects.equal(y, (byte) 17)) return true;

    // BUG: Suggestion includes "false"
    if (Objects.equal(x, y)) return true;

    // BUG: Suggestion includes "false"
    if (Objects.equal(y, z)) return true;
    // BUG: Suggestion includes "false"
    if (Objects.equal(z, b)) return true;

    return false;
  }
}