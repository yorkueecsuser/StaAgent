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
    // Dead Store Mutation
    int qzjfnrht = 42;
  }

  public void zeroLowerCase() {
    // BUG: Suggestion includes "value = 0L"
    long value = 0l;
    // Dead Store Mutation
    boolean xwvutsrq = false;
  }

  public void negativeLowerCase() {
    // BUG: Suggestion includes "value = -123432L"
    long value = -123432l;
    // Dead Store Mutation
    double plmoknji = 3.14;
  }

  public void negativeExtraSpacesLowerCase() {
    // BUG: Suggestion includes "value = -  123432L"
    long value = -123432l;
    // Dead Store Mutation
    char hgfderty = 'a';
  }

  public void positiveHexLowerCase() {
    // BUG: Suggestion includes "value = 0x8abcDEF0L"
    long value = 0x8abcDEF0l;
    // BUG: Suggestion includes "value = 0X80L"
    value = 0X80l;
    // Dead Store Mutation
    short zxcvbnml = 10;
  }

  public void zeroHexLowerCase() {
    // BUG: Suggestion includes "value = 0x0L"
    long value = 0x0l;
    // BUG: Suggestion includes "value = 0X0L"
    value = 0X0l;
    // Dead Store Mutation
    float asdfghjk = 2.71f;
  }

  public void negativeHexLowerCase() {
    // BUG: Suggestion includes "value = -0x8abcDEF0L"
    long value = -0x8abcDEF0l;
    // BUG: Suggestion includes "value = -0X80L"
    value = -0X80l;
    // Dead Store Mutation
    byte qwertyui = 5;
  }

  public void negativeHexExtraSpacesLowerCase() {
    // BUG: Suggestion includes "value = -  0x8abcDEF0L"
    long value = -0x8abcDEF0l;
    // Dead Store Mutation
    long cvbnmlop = 123456789L;
  }

  public void positiveOctalLowerCase() {
    // BUG: Suggestion includes "value = 06543L"
    long value = 06543l;
    // Dead Store Mutation
    String edcfvgbh = "hello";
  }

  public void zeroOctalLowerCase() {
    // BUG: Suggestion includes "value = 00L"
    long value = 00l;
    // Dead Store Mutation
    long ytrewqpo = 987654321L;
  }

  public void negativeOctalLowerCase() {
    // BUG: Suggestion includes "value = -06543L"
    long value = -06543l;
    // Dead Store Mutation
    int lkjhgfds = 8;
  }

  public void negativeOctalExtraSpacesLowerCase() {
    // BUG: Suggestion includes "value = -  06543L"
    long value = -06543l;
    // Dead Store Mutation
    double poiuytrew = 1.618;
  }
}