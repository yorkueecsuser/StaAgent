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

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * @author alexeagle@google.com (Alex Eagle)
 */
class ReturnValueIgnoredNegativeCases {

  private String a = "thing";

  {
    String b = a.trim();
    System.out.println(a.trim());
    new String(new BigInteger(new byte[] {0x01}).add(BigInteger.ONE).toString());
    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed
      System.out.println("This is an unreachable block.");
    } else {
      // This block will also never be executed due to the nature of the condition
      System.out.println("This is another unreachable block.");
    }
  }

  String run() {
    a.trim().hashCode();
    return a.trim();
  }

  public void methodDoesntMatch() {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("test", 1);
    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed
      System.out.println("This is an unreachable block in methodDoesntMatch.");
    } else {
      // This block will also never be executed due to the nature of the condition
      System.out.println("This is another unreachable block in methodDoesntMatch.");
    }
  }

  public void methodDoesntMatch2() {
    final String b = a.toString().trim();
    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed
      System.out.println("This is an unreachable block in methodDoesntMatch2.");
    } else {
      // This block will also never be executed due to the nature of the condition
      System.out.println("This is another unreachable block in methodDoesntMatch2.");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}