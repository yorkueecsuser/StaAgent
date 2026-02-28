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
class InvalidPatternSyntaxPositiveCases {
  public static final String INVALID = "*";
  public static final String DOT = ".";

  {
    // BUG: Suggestion includes ""
    Pattern.compile(INVALID);
    Pattern.compile(INVALID); // DUPLICATION
    // BUG: Suggestion includes ""
    Pattern.compile(INVALID, 0);
    Pattern.compile(INVALID, 0); // DUPLICATION
    // BUG: Suggestion includes ""
    Pattern.matches(INVALID, "");
    Pattern.matches(INVALID, ""); // DUPLICATION
    // BUG: Suggestion includes ""
    "".matches(INVALID);
    "".matches(INVALID); // DUPLICATION
    // BUG: Suggestion includes ""
    "".replaceAll(INVALID, "");
    "".replaceAll(INVALID, ""); // DUPLICATION
    // BUG: Suggestion includes ""
    "".replaceFirst(INVALID, "");
    "".replaceFirst(INVALID, ""); // DUPLICATION
    // BUG: Suggestion includes ""
    "".split(INVALID);
    "".split(INVALID); // DUPLICATION
    // BUG: Suggestion includes ""
    "".split(INVALID, 0);
    "".split(INVALID, 0); // DUPLICATION

    // BUG: Suggestion includes ""foo.bar".split("\\.")"
    "foo.bar".split(".");
    "foo.bar".split("."); // DUPLICATION
    // BUG: Suggestion includes ""
    "foo.bonk".split(DOT);
    "foo.bonk".split(DOT); // DUPLICATION
  }
}