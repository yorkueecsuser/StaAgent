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
    String c = b; // Mutant: Renamed 'b' to 'c'
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
    int d = 2; // Mutant: Added a new variable 'd'
  }

  public void methodDoesntMatch2() {
    final String b = a.toString().trim();
    final String e = b; // Mutant: Renamed 'b' to 'e'
  }
}