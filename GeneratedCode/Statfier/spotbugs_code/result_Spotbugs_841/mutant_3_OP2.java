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
    Pattern.compile("t"); // DUPLICATION
    Pattern.compile("t", 0);
    Pattern.compile("t", 0); // DUPLICATION
    Pattern.matches("t", "");
    Pattern.matches("t", ""); // DUPLICATION
    "".matches("t");
    "".matches("t"); // DUPLICATION
    "".replaceAll("t", "");
    "".replaceAll("t", ""); // DUPLICATION
    "".replaceFirst("t", "");
    "".replaceFirst("t", ""); // DUPLICATION
    "".split("t");
    "".split("t"); // DUPLICATION
    "".split("t", 0);
    "".split("t", 0); // DUPLICATION

    Pattern.compile(x);
    Pattern.compile(x); // DUPLICATION
    Pattern.compile(x, 0);
    Pattern.compile(x, 0); // DUPLICATION
    Pattern.matches(x, "");
    Pattern.matches(x, ""); // DUPLICATION
    "".matches(x);
    "".matches(x); // DUPLICATION
    "".replaceAll(x, "");
    "".replaceAll(x, ""); // DUPLICATION
    "".replaceFirst(x, "");
    "".replaceFirst(x, ""); // DUPLICATION
    "".split(x);
    "".split(x); // DUPLICATION
    "".split(x, 0);
    "".split(x, 0); // DUPLICATION
  }
}