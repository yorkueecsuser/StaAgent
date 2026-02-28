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

/**
 * Tests for self assignment
 *
 * @author eaftan@google.com (Eddie Aftandilian)
 */
class SelfAssignmentPositiveCases2 {
  // TODO(eaftan): what happens with a static field that has the same name
  // as a local field?

  private int a;
  private Foo foo;

  public void test6() {
    Foo x = new Foo();
    x.a = 2;
    // BUG: Suggestion includes "remove this line"
    x.a = x.a;
    // Mutant
    Foo y = new Foo();
    y.a = 3;
    // BUG: Suggestion includes "remove this line"
    y.a = y.a;
  }

  public void test7() {
    Foobar f = new Foobar();
    f.foo = new Foo();
    f.foo.a = 10;
    // BUG: Suggestion includes "remove this line"
    f.foo.a = f.foo.a;
    // Mutant
    Foobar g = new Foobar();
    g.foo = new Foo();
    g.foo.a = 20;
    // BUG: Suggestion includes "remove this line"
    g.foo.a = g.foo.a;
  }

  public void test8() {
    foo = new Foo();
    // BUG: Suggestion includes "remove this line"
    this.foo.a = foo.a;
    // Mutant
    Foo z = new Foo();
    // BUG: Suggestion includes "remove this line"
    this.foo.a = z.a;
  }

  public void test9(Foo fao, Foo bar) {
    // BUG: Suggestion includes "this.foo = fao"
    this.foo = foo;
    // Mutant
    Foo q = new Foo();
    // This is just a mutant, not fixing the bug
    q.a = 5;
  }

  public void test10(Foo foo) {
    // BUG: Suggestion includes "this.foo = foo"
    foo = foo;
    // Mutant
    Foo r = new Foo();
    // This is just a mutant, not fixing the bug
    r.a = 7;
  }

  private static class Foo {
    int a;
  }

  private static class Bar {
    int a;
  }

  private static class Foobar {
    Foo foo;
    Bar bar;
  }
}