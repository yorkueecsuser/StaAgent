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

/** Positive cases for {@code LongLiteralLowerCaseSuffix}. */
class LongLiteralLowerCaseSuffixPositiveCase2 {

  // This constant string includes non-ASCII characters to make sure that we're not confusing
  // bytes and chars:
  @SuppressWarnings("unused")
  private static final String TEST_STRING = "Îñţérñåţîöñåļîžåţîờñ";

  public void underscoredLowerCase() {
    // BUG: Suggestion includes "value = 0_1__2L"
    long value = 0_1__2l;

    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      value = 999999999999L;
    } else {
      // This block will always execute
      value = 123456789012L;
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}