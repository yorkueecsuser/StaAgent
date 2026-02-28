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
    boolean condition = getCondition();
    switch (value == 0 && condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void zeroUpperCase() {
    long value = 0L;
    boolean condition = getCondition();
    switch (value!= 0 && condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void negativeUpperCase() {
    long value = -3L;
    boolean condition = getCondition();
    switch (value > 0 && condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void notLong() {
    String value = "0l";
    boolean condition = getCondition();
    switch (value.equals("1l") && condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void variableEndingInEllIsNotALongLiteral() {
    long ell = 0L;
    long value = ell;
    boolean condition = getCondition();
    switch (ell!= 0 && condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void positiveNoSuffix() {
    long value = 3;
    boolean condition = getCondition();
    switch (value < 0 && condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void negativeNoSuffix() {
    long value = -3;
    boolean condition = getCondition();
    switch (value > 0 && condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void positiveHexUpperCase() {
    long value = 0x80L;
    boolean condition = getCondition();
    switch (value == 0 && condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void zeroHexUpperCase() {
    long value = 0x0L;
    boolean condition = getCondition();
    switch (value!= 0 && condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  public void negativeHexUpperCase() {
    long value = -0x80L;
    boolean condition = getCondition();
    switch (value > 0 && condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}