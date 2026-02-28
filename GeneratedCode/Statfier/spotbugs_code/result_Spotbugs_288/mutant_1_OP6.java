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
    
    // Introduced unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }

    String thing = null;
    // BUG: Suggestion includes "(thing, "
    checkNotNull("thing is null", thing);
    
    // Introduced unreachable for loop
    boolean anotherConditionFor = getAnotherCondition();
    for (int j = 0; anotherConditionFor; j++) {
      // This loop is unreachable because getAnotherCondition() returns false
    }

    // BUG: Suggestion includes ""
    Preconditions.checkNotNull("a string literal " + "that's got two parts", thing);
    
    // Introduced unreachable for loop
    boolean yetAnotherConditionFor = getYetAnotherCondition();
    for (int k = 0; yetAnotherConditionFor; k++) {
      // This loop is unreachable because getYetAnotherCondition() returns false
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