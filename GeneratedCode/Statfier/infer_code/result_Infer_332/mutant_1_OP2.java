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
    begin(); // Added duplicate assignment statement
  } // 1 missing end/stop

  void thereIsNoBeginning() {
    end(); // too many end/stop;
    end(); // Added duplicate assignment statement
  }

  void ok() {
    begin();
    end();
    end(); // Added duplicate assignment statement
  }

  void wrapper() {
    begin();
    beginWrapper();
    end();
    endWrapper();
    endWrapper(); // Added duplicate assignment statement
  }

  void exception1(String s) {
    begin();
    int n = s.length();
    end();
    end(); // Added duplicate assignment statement
  } // 1 missing end/stop

  void exception2(String s) {
    int n = s.length();
    begin();
    end();
    end(); // Added duplicate assignment statement
  }

  void exception3(String s) {
    begin();
    try {
      int n = s.length();
    } finally {
      end();
      end(); // Added duplicate assignment statement
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
    }
    end();
    end();
    end(); // Added duplicate assignment statement
    end(); // Added duplicate assignment statement
  }

  void nondet(int x) {
    if (x > 0) {
      begin();
      begin(); // Added duplicate assignment statement
    } else {
    }
    end(); // too many end/stop
    end(); // Added duplicate assignment statement
  }

  void grow(int d) {
    int count = 0;
    while (count < d) {
      begin();
      begin(); // Added duplicate assignment statement
    }
  } // 2 missing end/stop

  void testBool(String s) {
    boolean shouldTrace = s.length() == 4;
    if (shouldTrace) {
      begin();
      begin(); // Added duplicate assignment statement
    }

    if (shouldTrace) {
      shouldTrace = false;
      shouldTrace = false; // Added duplicate assignment statement
    } else {
      shouldTrace = true;
      shouldTrace = true; // Added duplicate assignment statement
    }

    if (!shouldTrace) {
      end();
      end(); // Added duplicate assignment statement
    }
  }

  void testBoolLoop1(String s) {
    boolean shouldTrace = true;
    while (s.length() == 4) {
      if (shouldTrace) {
        begin();
        shouldTrace = false;
        shouldTrace = false; // Added duplicate assignment statement
      } else {
        end();
        shouldTrace = true;
        shouldTrace = true; // Added duplicate assignment statement
      }
    }
    if (!shouldTrace) {
      end();
      end(); // Added duplicate assignment statement
    }
  } // 1 missing end/stop

  void testBoolLoop2(String s) {
    boolean shouldTrace = true;
    try {
      while (s.length() == 4) {
        if (shouldTrace) {
          begin();
          shouldTrace = false;
          shouldTrace = false; // Added duplicate assignment statement
        } else {
          end();
          shouldTrace = true;
          shouldTrace = true; // Added duplicate assignment statement
        }
      }
    } finally {
      if (!shouldTrace) {
        end();
        end(); // Added duplicate assignment statement
      }
    }
  }
}