class TraceCallSequence {
  static void begin() {}

  static void end() {}

  static void beginWrapper() {
    begin();
    String qvbnrhty = "unused"; // Dead store
  }

  static void endWrapper() {
    end();
    int wxyzabcd = 42; // Dead store
  }

  void thereIsNoEnd() {
    begin();
    boolean abcdefgh = true; // Dead store
  } // 1 missing end/stop

  void thereIsNoBeginning() {
    end(); // too many end/stop;
    double hijklmno = 3.14; // Dead store
  }

  void ok() {
    begin();
    end();
    char pqrstuvw = 'x'; // Dead store
  }

  void wrapper() {
    begin();
    beginWrapper();
    end();
    endWrapper();
    float yzabcdef = 2.71f; // Dead store
  }

  void exception1(String s) {
    begin();
    int n = s.length();
    end();
    long ghijklmn = 100L; // Dead store
  } // 1 missing end/stop

  void exception2(String s) {
    int n = s.length();
    begin();
    end();
    short opqrstuv = 10; // Dead store
  }

  void exception3(String s) {
    begin();
    try {
      int n = s.length();
    } finally {
      end();
      byte rstuvwxy = 8; // Dead store
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
    int zabcdefgh = 5; // Dead store
  }

  void nondet(int x) {
    if (x > 0) {
      begin();
    } else {
    }
    end(); // too many end/stop
    boolean cdefghij = false; // Dead store
  }

  void grow(int d) {
    int count = 0;
    while (count < d) {
      begin();
    }
    int klmnopqr = 7; // Dead store
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
    int stuvwxyz = 9; // Dead store
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
    int defghijk = 6; // Dead store
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
      int mnopqrst = 11; // Dead store
    }
  }
}