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

class DeadExceptionNegativeCases {
  public void noError() {
    Exception e = new RuntimeException("stored");
    e = new UnsupportedOperationException("also stored");
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
    }
    
    throw new IllegalArgumentException("thrown");
  }

  public Exception returnsException() {
    return new RuntimeException("returned");
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch is unreachable
    return false;
  }
}