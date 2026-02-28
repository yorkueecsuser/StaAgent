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

class PreconditionsCheckNotNullPositiveCase1 {
  public void error() {
    // BUG: Suggestion includes "remove this line"
    Preconditions.checkNotNull("string literal");
    
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false
    }

    String thing = null;
    // BUG: Suggestion includes "(thing, "
    checkNotNull("thing is null", thing);
    
    // Introduced unreachable while loop
    boolean anotherConditionWhile = getAnotherCondition();
    while (anotherConditionWhile) {
      // This loop is unreachable because anotherConditionWhile will always be false
    }

    // BUG: Suggestion includes ""
    Preconditions.checkNotNull("a string literal " + "that's got two parts", thing);
    
    // Introduced unreachable while loop
    boolean yetAnotherConditionWhile = getYetAnotherCondition();
    while (yetAnotherConditionWhile) {
      // This loop is unreachable because yetAnotherConditionWhile will always be false
    }
  }

  private boolean getCondition() {
    return false;
  }

  private boolean getAnotherCondition() {
    return false;
  }

  private boolean getYetAnotherCondition() {
    return false;
  }
}