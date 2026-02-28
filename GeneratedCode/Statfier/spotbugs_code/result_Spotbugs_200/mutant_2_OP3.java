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

import com.google.common.base.Objects;

/**
 * @author alexeagle@google.com (Alex Eagle)
 */
class SelfEqualsNegativeCases {
  private String field;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass()!= o.getClass()) {
      return false;
    }

    SelfEqualsNegativeCases other = (SelfEqualsNegativeCases) o;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This will never be printed");
    }
    return Objects.equal(field, other.field);
  }

  @Override
  public int hashCode() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      System.out.println("This loop will never run");
    }
    return field!= null? field.hashCode() : 0;
  }

  public boolean equals2(Object o) {
    if (!(o instanceof SelfEqualsNegativeCases)) {
      return false;
    }

    SelfEqualsNegativeCases other = (SelfEqualsNegativeCases) o;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      System.out.println("This loop will never run");
    }
    return field.equals(other.field);
  }

  public boolean test() {
    boolean shouldRun = getCondition();
    if (shouldRun) { // Unreachable if statement
      System.out.println("This will never be printed");
    } else {
      System.out.println("This might be printed");
    }
    return Boolean.TRUE.toString().equals(Boolean.FALSE.toString());
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}