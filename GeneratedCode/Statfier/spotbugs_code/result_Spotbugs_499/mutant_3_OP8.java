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
class SelfAssignmentNegativeCases {
  private int a;

  public void test1(int a) {
    this.a = a;
  }

  public void test2() {
    int x = 0; // Mutated variable 'a' to 'x'
    int b = x;
    x = b;
  }

  public void test3() {
    int c = 10; // Mutated variable 'a' to 'c'
  }

  public void test4() {
    int j = 1; // Mutated variable 'i' to 'j'
    j += j;
  }

  public void test5(SelfAssignmentNegativeCases n) {
    a = n.a;
  }

  public void test6() {
    Foo foo = new Foo();
    Bar bar = new Bar();
    foo.a = bar.a;
  }

  public void test7() {
    Foobar f1 = new Foobar();
    f1.foo = new Foo();
    f1.bar = new Bar();
    f1.foo.a = f1.bar.a;
  }

  public void test8(SelfAssignmentNegativeCases that) {
    this.a = that.a;
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