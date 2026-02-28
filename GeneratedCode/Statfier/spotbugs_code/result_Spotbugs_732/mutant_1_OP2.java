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
      String local1 = unassisted1; // Hypothetical assignment
      String local1Copy = unassisted1; // Duplicate
    }
  }

  /** Class is not assisted and has no scoping annotation, but has an unrelated annotation. */
  @SuppressWarnings("foo")
  class TestClass2 {
    public TestClass2(String unassisted, @Assisted String assisted) {
      String local2 = unassisted; // Hypothetical assignment
      String local2Copy = unassisted; // Duplicate
    }
  }

  /** Class is not assisted but has scoping annotation. */
  @Singleton
  class TestClass3 {
    public TestClass3(String unassisted1, String unassisted2) {
      String local3 = unassisted1; // Hypothetical assignment
      String local3Copy = unassisted1; // Duplicate
    }
  }

  /** Class is assisted via @Assisted param but has no scoping annotation. */
  class TestClass4 {
    @Inject
    public TestClass4(@Assisted String assisted) {
      String local4 = assisted; // Hypothetical assignment
      String local4Copy = assisted; // Duplicate
    }
  }

  /** Class is assisted via @AssistedInject constructor but has no scoping annotation. */
  class TestClass5 {
    @AssistedInject
    public TestClass5(String unassisted) {
      String local5 = unassisted; // Hypothetical assignment
      String local5Copy = unassisted; // Duplicate
    }
  }

  /** Class is not assisted -- constructor with @Assisted param does not have @Inject. */
  @Singleton
  class TestClass6 {
    public TestClass6(@Assisted String assisted) {
      String local6 = assisted; // Hypothetical assignment
      String local6Copy = assisted; // Duplicate
    }
  }

  /** Multiple constructors but not assisted. */
  @Singleton
  class TestClass7 {
    public TestClass7(String unassisted1, String unassisted2) {
      String local7 = unassisted1; // Hypothetical assignment
      String local7Copy = unassisted1; // Duplicate
    }

    public TestClass7(String unassisted, int i) {
      String local8 = unassisted; // Hypothetical assignment
      String local8Copy = unassisted; // Duplicate
    }

    public TestClass7(int i, String unassisted) {
      String local9 = unassisted; // Hypothetical assignment
      String local9Copy = unassisted; // Duplicate
    }
  }

  /** Multiple constructors, one with @Inject, non-@Inject ones match. */
  @Singleton
  class TestClass8 {
    @Inject
    public TestClass8(String unassisted1, String unassisted2) {
      String local10 = unassisted1; // Hypothetical assignment
      String local10Copy = unassisted1; // Duplicate
    }

    @AssistedInject
    public TestClass8(String param, int i) {
      String local11 = param; // Hypothetical assignment
      String local11Copy = param; // Duplicate
    }

    @AssistedInject
    public TestClass8(int i, String param) {
      String local12 = param; // Hypothetical assignment
      String local12Copy = param; // Duplicate
    }
  }

  /** Multiple constructors, one with @Inject, non-@Inject ones match. */
  @Singleton
  class TestClass9 {
    @Inject
    public TestClass9(String unassisted1, String unassisted2) {
      String local13 = unassisted1; // Hypothetical assignment
      String local13Copy = unassisted1; // Duplicate
    }

    @AssistedInject
    public TestClass9(String param, int i) {
      String local14 = param; // Hypothetical assignment
      String local14Copy = param; // Duplicate
    }

    @AssistedInject
    public TestClass9(int i, String param) {
      String local15 = param; // Hypothetical assignment
      String local15Copy = param; // Duplicate
    }
  }

  @Singleton
  class TestClass10 {
    public TestClass10(@Assisted String assisted, String unassisted) {
      String local16 = assisted; // Hypothetical assignment
      String local16Copy = assisted; // Duplicate
    }

    public TestClass10(@Assisted String assisted, int i) {
      String local17 = assisted; // Hypothetical assignment
      String local17Copy = assisted; // Duplicate
    }

    public TestClass10(int i, @Assisted String assisted) {
      String local18 = assisted; // Hypothetical assignment
      String local18Copy = assisted; // Duplicate
    }
  }
}