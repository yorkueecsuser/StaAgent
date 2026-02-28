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
    boolean result = false; // Hypothetical assignment statement
    boolean resultCopy = result; // Duplicate of the assignment statement
    return false;
  }

  public boolean equals(CovariantEqualsNegativeCases other, String s) {
    boolean result = false; // Hypothetical assignment statement
    boolean resultCopy = result; // Duplicate of the assignment statement
    return false;
  }

  public void equals(CovariantEqualsNegativeCases other) {
    boolean flag = true; // Hypothetical assignment statement
    boolean flagCopy = flag; // Duplicate of the assignment statement
  }

  public List<Integer> equals(Integer other) {
    List<Integer> list = null; // Hypothetical assignment statement
    List<Integer> listCopy = list; // Duplicate of the assignment statement
    return null;
  }
}

class CovariantEqualsNegativeCase2 {
  @SuppressWarnings("CovariantEquals")
  public boolean equals(CovariantEqualsNegativeCase2 other) {
    boolean isEqual = false; // Hypothetical assignment statement
    boolean isEqualCopy = isEqual; // Duplicate of the assignment statement
    return false;
  }
}

class AnotherClass {
  public boolean equals(CovariantEqualsNegativeCases other) {
    boolean match = false; // Hypothetical assignment statement
    boolean matchCopy = match; // Duplicate of the assignment statement
    return false;
  }

  public int[] equals(int other) {
    int[] array = null; // Hypothetical assignment statement
    int[] arrayCopy = array; // Duplicate of the assignment statement
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
    if (other instanceof ClassWithEqualsOverridden) {
      return equals((ClassWithEqualsOverridden) other);
    } else {
      return false;
    }
  }

  public boolean equals(ClassWithEqualsOverridden other) {
    boolean isEqual = true; // Hypothetical assignment statement
    boolean isEqualCopy = isEqual; // Duplicate of the assignment statement
    return true;
  }
}

/**
 * Don't issue error when the covariant equals method is not public. In that case it wasn't intended
 * to override equals.
 */
class ClassWithNonPublicCovariantEquals {
  boolean equals(ClassWithNonPublicCovariantEquals other) {
    boolean isEqual = true; // Hypothetical assignment statement
    boolean isEqualCopy = isEqual; // Duplicate of the assignment statement
    return true;
  }
}