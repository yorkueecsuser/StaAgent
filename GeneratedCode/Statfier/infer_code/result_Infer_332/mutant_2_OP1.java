class TraceCallSequence {
  static void begin() {}

  static void end() {}

  static void beginWrapper() {
    begin();
    String abcdefgh = "unused"; // Dead Store
  }

  static void endWrapper() {
    end();
    int hijklmno = 42; // Dead Store
  }

  void thereIsNoEnd() {
    begin();
    double pqrsabcd = 3.14; // Dead Store
  } // 1 missing end/stop

  void thereIsNoBeginning() {
    end(); // too many end/stop;
    char tuvwxyza = 'x'; // Dead Store
  }

  void ok() {
    begin();
    end();
    float bcdefghi = 2.71f; // Dead Store
  }

  void wrapper() {
    begin();
    beginWrapper();
    end();
    endWrapper();
    long jklmnopq = 123456789L; // Dead Store
  }

  void exception1(String s) {
    begin();
    int n = s.length();
    end();
    short rstuvwxy = 10; // Dead Store
  } // 1 missing end/stop

  void exception2(String s) {
    int n = s.length();
    begin();
    end();
    byte zabcdefgh = 8; // Dead Store
  }

  void exception3(String s) {
    begin();
    try {
      int n = s.length();
    } finally {
      end();
      boolean abcdwxyz = true; // Dead Store
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
    int efghijkl = 5; // Dead Store
  }

  void nondet(int x) {
    if (x > 0) {
      begin();
    } else {
    }
    end(); // too many end/stop
    String mnopqrst = "test"; // Dead Store
  }

  void grow(int d) {
    int count = 0;
    while (count < d) {
      begin();
    }
    double uvwxyzab = 0.577; // Dead Store
  } // 2 missing end/stop

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
    int cdefghij = 7; // Dead Store
  }

  void testBoolLoop1(String s) {
    boolean shouldTrace = true;
    while (s.length() == 4) {
      if (shouldTrace) {
        begin();
        shouldTrace = false;
      } else {
        end();
        shouldTrace = true;
      }
    }
    if (!shouldTrace) {
      end();
    }
    char klmnopqr = 'y'; // Dead Store
  } // 1 missing end/stop

  void testBoolLoop2(String s) {
    boolean shouldTrace = true;
    try {
      while (s.length() == 4) {
        if (shouldTrace) {
          begin();
          shouldTrace = false;
        } else {
          end();
          shouldTrace = true;
        }
      }
    } finally {
      if (!shouldTrace) {
        end();
      }
      int stuvwxyz = 9; // Dead Store
    }
  }
}