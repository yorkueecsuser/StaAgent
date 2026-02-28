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

import com.google.common.collect.Ordering;
import java.util.Comparator;

/**
 * Positive test cases for theOrdering.from(new Comparator&lt;T&gt;() {... }) check
 *
 * @author sjnickerson@google.com (Simon Nickerson)
 */
class OrderingFromPositiveCases {

  public static void positiveCase1() {
    // BUG: Suggestion includes "new Ordering<String>("
    Ordering<String> ord =
        Ordering.from(
            new Comparator<String>() {
              @Override
              public int compare(String first, String second) {
                int compare = first.length() - second.length();
                boolean unreachableCondition = getUnreachableCondition();
                if (unreachableCondition) {
                  // This is an unreachable if statement
                  compare = 0; // This line will never be executed
                }
                return (compare!= 0)? compare : first.compareTo(second);
              }

              private boolean getUnreachableCondition() {
                return false; // This method always returns false, ensuring the if statement is unreachable
              }
            });
  }
}