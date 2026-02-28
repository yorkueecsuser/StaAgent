class TraceCallSequence {
  static void begin() {}

  static void end() {}

  static void beginWrapper() {
    begin();
  }

  static void endWrapper() {
    end();
  }

  void thereIsNoEnd() {
    begin();
    begin(); // Mutation: Duplicate assignment statement
  } // 1 missing end/stop

  void thereIsNoBeginning() {
    end(); // too many end/stop;
    end(); // Mutation: Duplicate assignment statement
  }

  void ok() {
    begin();
    end();
    end(); // Mutation: Duplicate assignment statement
  }

  void wrapper() {
    begin();
    beginWrapper();
    end();
    endWrapper();
    endWrapper(); // Mutation: Duplicate assignment statement
  }

  void exception1(String s) {
    begin();
    int n = s.length();
    end();
    end(); // Mutation: Duplicate assignment statement
  } // 1 missing end/stop

  void exception2(String s) {
    int n = s.length();
    begin();
    end();
    end(); // Mutation: Duplicate assignment statement
  }

  void exception3(String s) {
    begin();
    try {
      int n = s.length();
    } finally {
      end();
      end(); // Mutation: Duplicate assignment statement
    }
  }

  void infinite(int d) {
    int count = 0;
    begin();
    begin();
    while (count < d) {
      end();
      begin();
      count++;
      count++; // Mutation: Duplicate assignment statement
    }
    end();
    end();
    end(); // Mutation: Duplicate assignment statement
  }

  void nondet(int x) {
    if (x > 0) {
      begin();
      begin(); // Mutation: Duplicate assignment statement
    } else {
    }
    end(); // too many end/stop
    end(); // Mutation: Duplicate assignment statement
  }

  void grow(int d) {
    int count = 0;
    while (count < d) {
      begin();
      begin(); // Mutation: Duplicate assignment statement
    }
  } // 2 missing end/stop

  void testBool(String s) {
    boolean shouldTrace = s.length() == 4;
    if (shouldTrace) {
      begin();
      begin(); // Mutation: Duplicate assignment statement
    }

    if (shouldTrace) {
      shouldTrace = false;
      shouldTrace = false; // Mutation: Duplicate assignment statement
    } else {
      shouldTrace = true;
      shouldTrace = true; // Mutation: Duplicate assignment statement
    }

    if (!shouldTrace) {
      end();
      end(); // Mutation: Duplicate assignment statement
    }
  }

  void testBoolLoop1(String s) {
    boolean shouldTrace = true;
    while (s.length() == 4) {
      if (shouldTrace) {
        begin();
        shouldTrace = false;
        shouldTrace = false; // Mutation: Duplicate assignment statement
      } else {
        end();
        shouldTrace = true;
        shouldTrace = true; // Mutation: Duplicate assignment statement
      }
    }
    if (!shouldTrace) {
      end();
      end(); // Mutation: Duplicate assignment statement
    }
  } // 1 missing end/stop

  void testBoolLoop2(String s) {
    boolean shouldTrace = true;
    try {
      while (s.length() == 4) {
        if (shouldTrace) {
          begin();
          shouldTrace = false;
          shouldTrace = false; // Mutation: Duplicate assignment statement
        } else {
          end();
          shouldTrace = true;
          shouldTrace = true; // Mutation: Duplicate assignment statement
        }
      }
    } finally {
      if (!shouldTrace) {
        end();
        end(); // Mutation: Duplicate assignment statement
      }
    }
  }
}