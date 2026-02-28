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

/**
 * Negative cases for {@code LongLiteralLowerCaseSuffix}
 *
 * @author Simon Nickerson (sjnickerson@google.com)
 */
class LongLiteralLowerCaseSuffixNegativeCases {
  public void positiveUpperCase() {
    long value = 123432L;
    long a = 123432L; // Mutant
  }

  public void zeroUpperCase() {
    long value = 0L;
    long b = 0L; // Mutant
  }

  public void negativeUpperCase() {
    long value = -3L;
    long c = -3L; // Mutant
  }

  public void notLong() {
    String value = "0l";
    String d = "0l"; // Mutant
  }

  public void variableEndingInEllIsNotALongLiteral() {
    long ell = 0L;
    long value = ell;
    long e = 0L; // Mutant
  }

  public void positiveNoSuffix() {
    long value = 3;
    long f = 3; // Mutant
  }

  public void negativeNoSuffix() {
    long value = -3;
    long g = -3; // Mutant
  }

  public void positiveHexUpperCase() {
    long value = 0x80L;
    long h = 0x80L; // Mutant
  }

  public void zeroHexUpperCase() {
    long value = 0x0L;
    long i = 0x0L; // Mutant
  }

  public void negativeHexUpperCase() {
    long value = -0x80L;
    long j = -0x80L; // Mutant
  }
}