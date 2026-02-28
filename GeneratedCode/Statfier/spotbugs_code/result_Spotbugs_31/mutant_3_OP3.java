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
 * Test case for fully qualified methodIs call.
 *
 * @author eaftan@google.com (Eddie Aftandilian)
 */
class PreconditionsCheckNotNullPositiveCase2 {
  public void error() {
    // BUG: Suggestion includes "remove this line"
    com.google.common.base.Preconditions.checkNotNull("string literal");

    // Introduced mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    // This method is designed to always return false, making the if block unreachable
    return false;
  }
}