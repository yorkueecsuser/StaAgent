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
  } // 1 missing end/stop

  void thereIsNoBeginning() {
    end(); // too many end/stop;
  }

  void ok() {
    begin();
    end();
  }

  void wrapper() {
    begin();
    beginWrapper();
    end();
    endWrapper();
  }

  void exception1(String s) {
    begin();
    int n = s.length();
    end();
  } // 1 missing end/stop

  void exception2(String s) {
    int n = s.length();
    begin();
    end();
  }

  void exception3(String s) {
    begin();
    try {
      int n = s.length();
    } finally {
      end();
    }
  }

  void infinite(int d) {
    int count = 0;
    begin();
    begin();
    do {
      end();
      begin();
      count++;
    } while (count < d);
    end();
    end();
  }

  void nondet(int x) {
    if (x > 0) {
      begin();
    } else {
    }
    end(); // too many end/stop
  }

  void grow(int d) {
    int count = 0;
    do {
      begin();
    } while (count++ < d); // 2 missing end/stop
  }

  void testBool(String s) {
    boolean shouldTrace = s.length() == 4;
    if (shouldTrace) {
      begin();
    }

    if (shouldTrace) {
      shouldTrace = false;
    } else {
      shouldTrace = true;
    }

    if (!shouldTrace) {
      end();
    }
  }

  void testBoolLoop1(String s) {
    boolean shouldTrace = true;
    do {
      if (shouldTrace) {
        begin();
        shouldTrace = false;
      } else {
        end();
        shouldTrace = true;
      }
    } while (s.length() == 4);
    if (!shouldTrace) {
      end();
    }
  } // 1 missing end/stop

  void testBoolLoop2(String s) {
    boolean shouldTrace = true;
    try {
      do {
        if (shouldTrace) {
          begin();
          shouldTrace = false;
        } else {
          end();
          shouldTrace = true;
        }
      } while (s.length() == 4);
    } finally {
      if (!shouldTrace) {
        end();
      }
    }
  }
}