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
import com.google.inject.servlet.RequestScoped;

/**
 * @author eaftan@google.com (Eddie Aftandilian)
 */
class GuiceAssistedInjectScopingPositiveCases {

  // BUG: Suggestion includes "remove this line"
  @Singleton
  class TestClass {
    @Inject
    public TestClass(String unassisted, @Assisted String assisted) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in TestClass");
      }
    }
  }

  // BUG: Suggestion includes "remove this line"
  @RequestScoped
  class TestClass2 {
    @Inject
    public TestClass2(String unassisted, @Assisted String assisted) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in TestClass2");
      }
    }
  }

  // BUG: Suggestion includes "remove this line"
  @Singleton
  class TestClass3 {
    @AssistedInject
    public TestClass3(String param) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in TestClass3");
      }
    }
  }

  /** Multiple constructors, but only one with @Inject, and that one matches. */
  // BUG: Suggestion includes "remove this line"
  @Singleton
  class TestClass4 {
    @Inject
    public TestClass4(String unassisted, @Assisted String assisted) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in TestClass4");
      }
    }

    public TestClass4(String unassisted, int i) {}

    public TestClass4(int i, String unassisted) {}
  }

  /** Multiple constructors, none with @Inject, one matches. */
  // BUG: Suggestion includes "remove this line"
  @Singleton
  class TestClass5 {
    public TestClass5(String unassisted1, String unassisted2) {}

    public TestClass5(String unassisted, int i) {}

    @AssistedInject
    public TestClass5(int i, String unassisted) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in TestClass5");
      }
    }
  }

  /** JSR330 annotations. */
  // BUG: Suggestion includes "remove this line"
  @javax.inject.Singleton
  class TestClass6 {
    @javax.inject.Inject
    public TestClass6(String unassisted, @Assisted String assisted) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in TestClass6");
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}