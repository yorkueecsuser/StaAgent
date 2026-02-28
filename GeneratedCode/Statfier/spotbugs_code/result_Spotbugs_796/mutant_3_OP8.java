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
    long a = 123432l; // Mutant: renamed 'value' to 'a'
  }

  public void zeroLowerCase() {
    // BUG: Suggestion includes "value = 0L"
    long value = 0l;
    long b = 0l; // Mutant: renamed 'value' to 'b'
  }

  public void negativeLowerCase() {
    // BUG: Suggestion includes "value = -123432L"
    long value = -123432l;
    long c = -123432l; // Mutant: renamed 'value' to 'c'
  }

  public void negativeExtraSpacesLowerCase() {
    // BUG: Suggestion includes "value = -  123432L"
    long value = -123432l;
    long d = -123432l; // Mutant: renamed 'value' to 'd'
  }

  public void positiveHexLowerCase() {
    // BUG: Suggestion includes "value = 0x8abcDEF0L"
    long value = 0x8abcDEF0l;
    long e = 0x8abcDEF0l; // Mutant: renamed 'value' to 'e'
    // BUG: Suggestion includes "value = 0X80L"
    value = 0X80l;
    long f = 0X80l; // Mutant: renamed 'value' to 'f'
  }

  public void zeroHexLowerCase() {
    // BUG: Suggestion includes "value = 0x0L"
    long value = 0x0l;
    long g = 0x0l; // Mutant: renamed 'value' to 'g'
    // BUG: Suggestion includes "value = 0X0L"
    value = 0X0l;
    long h = 0X0l; // Mutant: renamed 'value' to 'h'
  }

  public void negativeHexLowerCase() {
    // BUG: Suggestion includes "value = -0x8abcDEF0L"
    long value = -0x8abcDEF0l;
    long i = -0x8abcDEF0l; // Mutant: renamed 'value' to 'i'
    // BUG: Suggestion includes "value = -0X80L"
    value = -0X80l;
    long j = -0X80l; // Mutant: renamed 'value' to 'j'
  }

  public void negativeHexExtraSpacesLowerCase() {
    // BUG: Suggestion includes "value = -  0x8abcDEF0L"
    long value = -0x8abcDEF0l;
    long k = -0x8abcDEF0l; // Mutant: renamed 'value' to 'k'
  }

  public void positiveOctalLowerCase() {
    // BUG: Suggestion includes "value = 06543L"
    long value = 06543l;
    long l = 06543l; // Mutant: renamed 'value' to 'l'
  }

  public void zeroOctalLowerCase() {
    // BUG: Suggestion includes "value = 00L"
    long value = 00l;
    long m = 00l; // Mutant: renamed 'value' to'm'
  }

  public void negativeOctalLowerCase() {
    // BUG: Suggestion includes "value = -06543L"
    long value = -06543l;
    long n = -06543l; // Mutant: renamed 'value' to 'n'
  }

  public void negativeOctalExtraSpacesLowerCase() {
    // BUG: Suggestion includes "value = -  06543L"
    long value = -06543l;
    long o = -06543l; // Mutant: renamed 'value' to 'o'
  }
}