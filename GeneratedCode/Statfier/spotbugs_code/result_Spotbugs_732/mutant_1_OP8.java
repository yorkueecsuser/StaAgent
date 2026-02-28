/*
 * Copyright 2013 Google Inc. All Rights Reserved.
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

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;

/**
 * @author eaftan@google.com (Eddie Aftandilian)
 */
class GuiceAssistedInjectScopingNegativeCases {

  /** Class is not assisted and has no scoping annotation. */
  class TestClass1 {
    public TestClass1(String unassisted1, String unassisted2) {}
    // Mutant
    public TestClass1(String a, String b) {}
  }

  /** Class is not assisted and has no scoping annotation, but has an unrelated annotation. */
  @SuppressWarnings("foo")
  class TestClass2 {
    public TestClass2(String unassisted, @Assisted String assisted) {}
    // Mutant
    public TestClass2(String x, @Assisted String y) {}
  }

  /** Class is not assisted but has scoping annotation. */
  @Singleton
  class TestClass3 {
    public TestClass3(String unassisted1, String unassisted2) {}
    // Mutant
    public TestClass3(String c, String d) {}
  }

  /** Class is assisted via @Assisted param but has no scoping annotation. */
  class TestClass4 {
    @Inject
    public TestClass4(@Assisted String assisted) {}
    // Mutant
    @Inject
    public TestClass4(@Assisted String e) {}
  }

  /** Class is assisted via @AssistedInject constructor but has no scoping annotation. */
  class TestClass5 {
    @AssistedInject
    public TestClass5(String unassisted) {}
    // Mutant
    @AssistedInject
    public TestClass5(String f) {}
  }

  /** Class is not assisted -- constructor with @Assisted param does not have @Inject. */
  @Singleton
  class TestClass6 {
    public TestClass6(@Assisted String assisted) {}
    // Mutant
    public TestClass6(@Assisted String g) {}
  }

  /** Multiple constructors but not assisted. */
  @Singleton
  class TestClass7 {
    public TestClass7(String unassisted1, String unassisted2) {}

    public TestClass7(String unassisted, int i) {}

    public TestClass7(int i, String unassisted) {}
    // Mutant
    public TestClass7(String h, int j) {}
  }

  /** Multiple constructors, one with @Inject, non-@Inject ones match. */
  @Singleton
  class TestClass8 {
    @Inject
    public TestClass8(String unassisted1, String unassisted2) {}

    @AssistedInject
    public TestClass8(String param, int i) {}

    @AssistedInject
    public TestClass8(int i, String param) {}
    // Mutant
    @Inject
    public TestClass8(String k, String l) {}
  }

  /** Multiple constructors, one with @Inject, non-@Inject ones match. */
  @Singleton
  class TestClass9 {
    @Inject
    public TestClass9(String unassisted1, String unassisted2) {}

    @AssistedInject
    public TestClass9(String param, int i) {}

    @AssistedInject
    public TestClass9(int i, String param) {}
    // Mutant
    @Inject
    public TestClass9(String m, String n) {}
  }

  @Singleton
  class TestClass10 {
    public TestClass10(@Assisted String assisted, String unassisted) {}

    public TestClass10(@Assisted String assisted, int i) {}

    public TestClass10(int i, @Assisted String assisted) {}
    // Mutant
    public TestClass10(@Assisted String o, String p) {}
  }
}