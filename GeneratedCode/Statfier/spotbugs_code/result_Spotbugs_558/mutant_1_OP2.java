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
  private String c = "anotherThing"; // Added for duplication example

  {
    String b = a.trim();
    b = a.trim(); // Duplicate of the assignment statement
    System.out.println(a.trim());
    new String(new BigInteger(new byte[] {0x01}).add(BigInteger.ONE).toString());
  }

  String run() {
    a.trim().hashCode();
    return a.trim();
  }

  public void methodDoesntMatch() {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("test", 1);
    Map<String, Integer> map2 = new HashMap<String, Integer>(); // Duplicate of the declaration and initialization
    map2.put("test", 1); // Duplicate of the put operation
  }

  public void methodDoesntMatch2() {
    final String b = a.toString().trim();
    final String b2 = a.toString().trim(); // Duplicate of the assignment statement
  }
}