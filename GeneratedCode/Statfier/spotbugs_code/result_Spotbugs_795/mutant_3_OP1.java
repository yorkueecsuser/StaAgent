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
    int qvbnrhty = 42; // Dead store
  }

  public void zeroUpperCase() {
    long value = 0L;
    String xwvfrtgb = "unused"; // Dead store
  }

  public void negativeUpperCase() {
    long value = -3L;
    double jkliuytr = 3.14; // Dead store
  }

  public void notLong() {
    String value = "0l";
    boolean cvbnmkiu = true; // Dead store
  }

  public void variableEndingInEllIsNotALongLiteral() {
    long ell = 0L;
    long value = ell;
    char wertuiop = 'a'; // Dead store
  }

  public void positiveNoSuffix() {
    long value = 3;
    float yuioplkj = 2.71f; // Dead store
  }

  public void negativeNoSuffix() {
    long value = -3;
    short hgfdsazx = 10; // Dead store
  }

  public void positiveHexUpperCase() {
    long value = 0x80L;
    long poiuytrew = 987654321L; // This is not a dead store, just for reference
    byte mnbvcxz = 127; // Dead store
  }

  public void zeroHexUpperCase() {
    long value = 0x0L;
    int lkjhgfdsa = 0; // Dead store
  }

  public void negativeHexUpperCase() {
    long value = -0x80L;
    long asdfghjkl = -987654321L; // This is not a dead store, just for reference
    long zxcvbnm = 654321; // Dead store
  }
}