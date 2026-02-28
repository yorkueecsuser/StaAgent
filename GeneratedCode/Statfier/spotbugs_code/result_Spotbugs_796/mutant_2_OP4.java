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
class LongLiteralLowerCaseSuffixPositiveCase1 {

  // This constant string includes non-ASCII characters to make sure that we're not confusing
  // bytes and chars:
  @SuppressWarnings("unused")
  private static final String TEST_STRING = "Îñţérñåţîöñåļîžåţîờñ";

  public void positiveLowerCase() {
    // BUG: Suggestion includes "value = 123432L"
    long value = 123432l;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      value = 999999l;
    } else {
      // Alternative code that should also never run
      value = 888888l;
    }
  }

  public void zeroLowerCase() {
    // BUG: Suggestion includes "value = 0L"
    long value = 0l;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      value = 999999l;
    } else {
      // Alternative code that should also never run
      value = 888888l;
    }
  }

  public void negativeLowerCase() {
    // BUG: Suggestion includes "value = -123432L"
    long value = -123432l;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      value = 999999l;
    } else {
      // Alternative code that should also never run
      value = 888888l;
    }
  }

  public void negativeExtraSpacesLowerCase() {
    // BUG: Suggestion includes "value = -  123432L"
    long value = -123432l;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      value = 999999l;
    } else {
      // Alternative code that should also never run
      value = 888888l;
    }
  }

  public void positiveHexLowerCase() {
    // BUG: Suggestion includes "value = 0x8abcDEF0L"
    long value = 0x8abcDEF0l;
    // BUG: Suggestion includes "value = 0X80L"
    value = 0X80l;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      value = 999999l;
    } else {
      // Alternative code that should also never run
      value = 888888l;
    }
  }

  public void zeroHexLowerCase() {
    // BUG: Suggestion includes "value = 0x0L"
    long value = 0x0l;
    // BUG: Suggestion includes "value = 0X0L"
    value = 0X0l;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      value = 999999l;
    } else {
      // Alternative code that should also never run
      value = 888888l;
    }
  }

  public void negativeHexLowerCase() {
    // BUG: Suggestion includes "value = -0x8abcDEF0L"
    long value = -0x8abcDEF0l;
    // BUG: Suggestion includes "value = -0X80L"
    value = -0X80l;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      value = 999999l;
    } else {
      // Alternative code that should also never run
      value = 888888l;
    }
  }

  public void negativeHexExtraSpacesLowerCase() {
    // BUG: Suggestion includes "value = -  0x8abcDEF0L"
    long value = -0x8abcDEF0l;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      value = 999999l;
    } else {
      // Alternative code that should also never run
      value = 888888l;
    }
  }

  public void positiveOctalLowerCase() {
    // BUG: Suggestion includes "value = 06543L"
    long value = 06543l;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      value = 999999l;
    } else {
      // Alternative code that should also never run
      value = 888888l;
    }
  }

  public void zeroOctalLowerCase() {
    // BUG: Suggestion includes "value = 00L"
    long value = 00l;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      value = 999999l;
    } else {
      // Alternative code that should also never run
      value = 888888l;
    }
  }

  public void negativeOctalLowerCase() {
    // BUG: Suggestion includes "value = -06543L"
    long value = -06543l;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      value = 999999l;
    } else {
      // Alternative code that should also never run
      value = 888888l;
    }
  }

  public void negativeOctalExtraSpacesLowerCase() {
    // BUG: Suggestion includes "value = -  06543L"
    long value = -06543l;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      value = 999999l;
    } else {
      // Alternative code that should also never run
      value = 888888l;
    }
  }

  private boolean getCondition() {
    return false; // This will ensure the if-else branches are unreachable
  }
}