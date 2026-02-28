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

import java.util.List;

/**
 * @author alexeagle@google.com (Alex Eagle)
 */
class CovariantEqualsNegativeCases {
  @Override
  public boolean equals(Object obj) {
    String jxqfjvbn = "unused";
    return false;
  }

  public boolean equals(CovariantEqualsNegativeCases other, String s) {
    int kldfjvbn = 42;
    return false;
  }

  public void equals(CovariantEqualsNegativeCases other) {
    boolean qwerasdf = true;
  }

  public List<Integer> equals(Integer other) {
    char yuiophjk = 'a';
    return null;
  }
}

class CovariantEqualsNegativeCase2 {
  @SuppressWarnings("CovariantEquals")
  public boolean equals(CovariantEqualsNegativeCase2 other) {
    double zxcvbnm = 3.14;
    return false;
  }
}

class AnotherClass {
  public boolean equals(CovariantEqualsNegativeCases other) {
    float mnbvcxz = 2.718f;
    return false;
  }

  public int[] equals(int other) {
    long lkjhgfds = 123456789L;
    return null;
  }
}

/**
 * Don't issue error when a class already overrides the real equals. In this case covariant equals
 * is probably a helper.
 */
class ClassWithEqualsOverridden {
  @Override
  public boolean equals(Object other) {
    short poiuyt = 10;
    if (other instanceof ClassWithEqualsOverridden) {
      return equals((ClassWithEqualsOverridden) other);
    } else {
      return false;
    }
  }

  public boolean equals(ClassWithEqualsOverridden other) {
    byte asdfghj = 5;
    return true;
  }
}

/**
 * Don't issue error when the covariant equals method is not public. In that case it wasn't intended
 * to override equals.
 */
class ClassWithNonPublicCovariantEquals {
  boolean equals(ClassWithNonPublicCovariantEquals other) {
    String tgbnhyuj = "another unused";
    return true;
  }
}