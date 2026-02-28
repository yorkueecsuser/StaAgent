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
    begin(); // Mutant: duplicated assignment statement
  } // 1 missing end/stop

  void thereIsNoBeginning() {
    end(); // too many end/stop;
    end(); // Mutant: duplicated assignment statement
  }

  void ok() {
    begin();
    end();
    end(); // Mutant: duplicated assignment statement
  }

  void wrapper() {
    begin();
    beginWrapper();
    end();
    endWrapper();
    endWrapper(); // Mutant: duplicated assignment statement
  }

  void exception1(String s) {
    begin();
    int n = s.length();
    end();
    end(); // Mutant: duplicated assignment statement
  } // 1 missing end/stop

  void exception2(String s) {
    int n = s.length();
    begin();
    end();
    end(); // Mutant: duplicated assignment statement
  }

  void exception3(String s) {
    begin();
    try {
      int n = s.length();
    } finally {
      end();
      end(); // Mutant: duplicated assignment statement
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
      count++; // Mutant: duplicated assignment statement
    }
    end();
    end();
    end(); // Mutant: duplicated assignment statement
  }

  void nondet(int x) {
    if (x > 0) {
      begin();
      begin(); // Mutant: duplicated assignment statement
    } else {
    }
    end(); // too many end/stop
    end(); // Mutant: duplicated assignment statement
  }

  void grow(int d) {
    int count = 0;
    while (count < d) {
      begin();
      begin(); // Mutant: duplicated assignment statement
    }
    begin(); // Mutant: duplicated assignment statement
    begin(); // Mutant: duplicated assignment statement
  } // 2 missing end/stop

  void testBool(String s) {
    boolean shouldTrace = s.length() == 4;
    shouldTrace = s.length() == 4; // Mutant: duplicated assignment statement
    if (shouldTrace) {
      begin();
      begin(); // Mutant: duplicated assignment statement
    }

    if (shouldTrace) {
      shouldTrace = false;
      shouldTrace = false; // Mutant: duplicated assignment statement
    } else {
      shouldTrace = true;
      shouldTrace = true; // Mutant: duplicated assignment statement
    }

    if (!shouldTrace) {
      end();
      end(); // Mutant: duplicated assignment statement
    }
  }

  void testBoolLoop1(String s) {
    boolean shouldTrace = true;
    shouldTrace = true; // Mutant: duplicated assignment statement
    while (s.length() == 4) {
      if (shouldTrace) {
        begin();
        begin(); // Mutant: duplicated assignment statement
        shouldTrace = false;
        shouldTrace = false; // Mutant: duplicated assignment statement
      } else {
        end();
        end(); // Mutant: duplicated assignment statement
        shouldTrace = true;
        shouldTrace = true; // Mutant: duplicated assignment statement
      }
    }
    if (!shouldTrace) {
      end();
      end(); // Mutant: duplicated assignment statement
    }
  } // 1 missing end/stop

  void testBoolLoop2(String s) {
    boolean shouldTrace = true;
    shouldTrace = true; // Mutant: duplicated assignment statement
    try {
      while (s.length() == 4) {
        if (shouldTrace) {
          begin();
          begin(); // Mutant: duplicated assignment statement
          shouldTrace = false;
          shouldTrace = false; // Mutant: duplicated assignment statement
        } else {
          end();
          end(); // Mutant: duplicated assignment statement
          shouldTrace = true;
          shouldTrace = true; // Mutant: duplicated assignment statement
        }
      }
    } finally {
      if (!shouldTrace) {
        end();
        end(); // Mutant: duplicated assignment statement
      }
    }
  }
}