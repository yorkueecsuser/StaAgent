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
    public TestClass1(String unassisted1, String unassisted2) {
      int dummy1 = 0; // Dummy assignment
      int dummy1Copy = dummy1; // Duplicate assignment
    }
  }

  /** Class is not assisted and has no scoping annotation, but has an unrelated annotation. */
  @SuppressWarnings("foo")
  class TestClass2 {
    public TestClass2(String unassisted, @Assisted String assisted) {
      int dummy2 = 1; // Dummy assignment
      int dummy2Copy = dummy2; // Duplicate assignment
    }
  }

  /** Class is not assisted but has scoping annotation. */
  @Singleton
  class TestClass3 {
    public TestClass3(String unassisted1, String unassisted2) {
      int dummy3 = 2; // Dummy assignment
      int dummy3Copy = dummy3; // Duplicate assignment
    }
  }

  /** Class is assisted via @Assisted param but has no scoping annotation. */
  class TestClass4 {
    @Inject
    public TestClass4(@Assisted String assisted) {
      int dummy4 = 3; // Dummy assignment
      int dummy4Copy = dummy4; // Duplicate assignment
    }
  }

  /** Class is assisted via @AssistedInject constructor but has no scoping annotation. */
  class TestClass5 {
    @AssistedInject
    public TestClass5(String unassisted) {
      int dummy5 = 4; // Dummy assignment
      int dummy5Copy = dummy5; // Duplicate assignment
    }
  }

  /** Class is not assisted -- constructor with @Assisted param does not have @Inject. */
  @Singleton
  class TestClass6 {
    public TestClass6(@Assisted String assisted) {
      int dummy6 = 5; // Dummy assignment
      int dummy6Copy = dummy6; // Duplicate assignment
    }
  }

  /** Multiple constructors but not assisted. */
  @Singleton
  class TestClass7 {
    public TestClass7(String unassisted1, String unassisted2) {
      int dummy7 = 6; // Dummy assignment
      int dummy7Copy = dummy7; // Duplicate assignment
    }

    public TestClass7(String unassisted, int i) {
      int dummy8 = 7; // Dummy assignment
      int dummy8Copy = dummy8; // Duplicate assignment
    }

    public TestClass7(int i, String unassisted) {
      int dummy9 = 8; // Dummy assignment
      int dummy9Copy = dummy9; // Duplicate assignment
    }
  }

  /** Multiple constructors, one with @Inject, non-@Inject ones match. */
  @Singleton
  class TestClass8 {
    @Inject
    public TestClass8(String unassisted1, String unassisted2) {
      int dummy10 = 9; // Dummy assignment
      int dummy10Copy = dummy10; // Duplicate assignment
    }

    @AssistedInject
    public TestClass8(String param, int i) {
      int dummy11 = 10; // Dummy assignment
      int dummy11Copy = dummy11; // Duplicate assignment
    }

    @AssistedInject
    public TestClass8(int i, String param) {
      int dummy12 = 11; // Dummy assignment
      int dummy12Copy = dummy12; // Duplicate assignment
    }
  }

  /** Multiple constructors, one with @Inject, non-@Inject ones match. */
  @Singleton
  class TestClass9 {
    @Inject
    public TestClass9(String unassisted1, String unassisted2) {
      int dummy13 = 12; // Dummy assignment
      int dummy13Copy = dummy13; // Duplicate assignment
    }

    @AssistedInject
    public TestClass9(String param, int i) {
      int dummy14 = 13; // Dummy assignment
      int dummy14Copy = dummy14; // Duplicate assignment
    }

    @AssistedInject
    public TestClass9(int i, String param) {
      int dummy15 = 14; // Dummy assignment
      int dummy15Copy = dummy15; // Duplicate assignment
    }
  }

  @Singleton
  class TestClass10 {
    public TestClass10(@Assisted String assisted, String unassisted) {
      int dummy16 = 15; // Dummy assignment
      int dummy16Copy = dummy16; // Duplicate assignment
    }

    public TestClass10(@Assisted String assisted, int i) {
      int dummy17 = 16; // Dummy assignment
      int dummy17Copy = dummy17; // Duplicate assignment
    }

    public TestClass10(int i, @Assisted String assisted) {
      int dummy18 = 17; // Dummy assignment
      int dummy18Copy = dummy18; // Duplicate assignment
    }
  }
}