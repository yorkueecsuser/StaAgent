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

import java.util.ArrayList;
import java.util.Date;

/**
 * @author alexeagle@google.com (Alex Eagle)
 */
class CollectionIncompatibleTypeNegativeCases {

  public boolean ok1() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in ok1");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in ok1");
    }
    return new ArrayList<String>().contains("ok");
  }

  class B extends Date {}

  public boolean ok2() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in ok2");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in ok2");
    }
    return new ArrayList<Date>().contains(new B());
  }

  public boolean ok3() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in ok3");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in ok3");
    }
    return new OtherCollection<String>().contains(new B());
  }

  private class OtherCollection<E> {
    public boolean contains(Object o) {
      boolean condition = getCondition();
      if (condition) {
        // Some unreachable code
        System.out.println("This is unreachable code in OtherCollection");
      } else {
        // Alternative unreachable code
        System.out.println("This is also unreachable code in OtherCollection");
      }
      return true;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if-else branches are unreachable
  }
}