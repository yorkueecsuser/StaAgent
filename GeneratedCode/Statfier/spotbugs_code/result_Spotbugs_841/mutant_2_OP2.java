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

import java.util.regex.Pattern;

/**
 * @author mdempsky@google.com (Matthew Dempsky)
 */
class InvalidPatternSyntaxNegativeCases {
  public void foo(String x) {
    Pattern.compile("t");
    Pattern.compile("t"); // Mutation: Duplicate of Pattern.compile("t");
    Pattern.compile("t", 0);
    Pattern.compile("t", 0); // Mutation: Duplicate of Pattern.compile("t", 0);
    Pattern.matches("t", "");
    Pattern.matches("t", ""); // Mutation: Duplicate of Pattern.matches("t", "");
    "".matches("t");
    "".matches("t"); // Mutation: Duplicate of "".matches("t");
    "".replaceAll("t", "");
    "".replaceAll("t", ""); // Mutation: Duplicate of "".replaceAll("t", "");
    "".replaceFirst("t", "");
    "".replaceFirst("t", ""); // Mutation: Duplicate of "".replaceFirst("t", "");
    "".split("t");
    "".split("t"); // Mutation: Duplicate of "".split("t");
    "".split("t", 0);
    "".split("t", 0); // Mutation: Duplicate of "".split("t", 0);

    Pattern.compile(x);
    Pattern.compile(x); // Mutation: Duplicate of Pattern.compile(x);
    Pattern.compile(x, 0);
    Pattern.compile(x, 0); // Mutation: Duplicate of Pattern.compile(x, 0);
    Pattern.matches(x, "");
    Pattern.matches(x, ""); // Mutation: Duplicate of Pattern.matches(x, "");
    "".matches(x);
    "".matches(x); // Mutation: Duplicate of "".matches(x);
    "".replaceAll(x, "");
    "".replaceAll(x, ""); // Mutation: Duplicate of "".replaceAll(x, "");
    "".replaceFirst(x, "");
    "".replaceFirst(x, ""); // Mutation: Duplicate of "".replaceFirst(x, "");
    "".split(x);
    "".split(x); // Mutation: Duplicate of "".split(x);
    "".split(x, 0);
    "".split(x, 0); // Mutation: Duplicate of "".split(x, 0);
  }
}