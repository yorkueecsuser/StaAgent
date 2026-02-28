/*
 * Copyright 2011 Google Inc. All Rights Reserved.
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

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Preconditions;

class PreconditionsCheckNotNullPrimitivePositiveCases {

  private Tester z = new Tester();

  public void test() {
    Object x = new Object();
    Object y = new Object();
    byte byte1 = 0;
    short short1 = 0;
    int int1 = 0, int2 = 0;
    long long1 = 0;
    float float1 = 0;
    double double1 = 0;
    boolean boolean1 = false, boolean2 = false;
    char char1 = 0;
    Tester tester = new Tester();

    // Do we detect all primitive types?

    // BUG: Suggestion includes "remove this line"
    Preconditions.checkNotNull(byte1);
    // BUG: Suggestion includes "remove this line"
    Preconditions.checkNotNull(short1);
    // BUG: Suggestion includes "remove this line"
    Preconditions.checkNotNull(int1);
    // BUG: Suggestion includes "remove this line"
    Preconditions.checkNotNull(long1);
    // BUG: Suggestion includes "remove this line"
    Preconditions.checkNotNull(float1);
    // BUG: Suggestion includes "remove this line"
    Preconditions.checkNotNull(double1);
    // BUG: Suggestion includes "remove this line"
    Preconditions.checkNotNull(boolean1);
    // BUG: Suggestion includes "remove this line"
    Preconditions.checkNotNull(char1);

    // Do we give the right suggested fix?

    // BUG: Suggestion includes "boolean1 = boolean2;"
    boolean1 = Preconditions.checkNotNull(boolean2);
    // BUG: Suggestion includes "boolean1 = int1 == int2;"
    boolean1 = Preconditions.checkNotNull(int1 == int2);
    // BUG: Suggestion includes "checkState(tester.hasId())"
    Preconditions.checkNotNull(tester.hasId());
    // BUG: Suggestion includes "checkState(tester.hasId(), "Must have ID!")"
    Preconditions.checkNotNull(tester.hasId(), "Must have ID!");
    // BUG: Suggestion includes "checkState(tester.hasId(), "Must have %s!", "ID")"
    Preconditions.checkNotNull(tester.hasId(), "Must have %s!", "ID");

    // Do we handle arguments that evaluate to a primitive type?

    // BUG: Suggestion includes "Preconditions.checkNotNull(a)"
    Preconditions.checkNotNull(x!= null);
    // BUG: Suggestion includes "Preconditions.checkNotNull(a)"
    Preconditions.checkNotNull(x == null);
    // BUG: Suggestion includes "Preconditions.checkState(int1 == int2)"
    Preconditions.checkNotNull(int1 == int2);
    // BUG: Suggestion includes "Preconditions.checkState(int1 > int2)"
    Preconditions.checkNotNull(int1 > int2);
    // BUG: Suggestion includes "remove this line"
    Preconditions.checkNotNull(boolean1? int1 : int2);

    // Do we handle static imports?

    // BUG: Suggestion includes "remove this line"
    checkNotNull(byte1);
    // BUG: Suggestion includes "'checkState(tester.hasId())"
    checkNotNull(tester.hasId());
  }

  public void test2(Tester q) {
    Tester w = new Tester();
    // Do we correctly distinguish checkArgument from checkState?

    // BUG: Suggestion includes "checkArgument(arg.hasId())"
    checkNotNull(q.hasId());
    // BUG: Suggestion includes "checkState(field.hasId())"
    checkNotNull(z.hasId());
    // BUG: Suggestion includes "checkState(local.hasId())"
    checkNotNull(w.hasId());
    // BUG: Suggestion includes "checkState(!local.hasId())"
    checkNotNull(!w.hasId());

    // BUG: Suggestion includes "checkState(!(arg instanceof Tester))"
    checkNotNull(!(q instanceof Tester));

    // BUG: Suggestion includes "remove this line"
    checkNotNull(q.getId());
    // BUG: Suggestion includes "id = arg.getId()"
    int id = checkNotNull(q.getId());

    // BUG: Suggestion includes "boolean b = arg.hasId();"
    boolean b = checkNotNull(q.hasId());

    // Do we handle long chains of method calls?

    // BUG: Suggestion includes "checkArgument(arg.getTester().getTester().hasId())"
    checkNotNull(q.getTester().getTester().hasId());

    // BUG: Suggestion includes "checkArgument(arg.tester.getTester().hasId())"
    checkNotNull(q.tester.getTester().hasId());
  }

  private static class Tester {
    public Tester tester;

    public boolean hasId() {
      return true;
    }

    public int getId() {
      return 10;
    }

    public Tester getTester() {
      return tester;
    }
  }
}