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
    while (count < d) {
      end();
      begin();
      count++;
    }
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
    while (count < d) {
      begin();
    }
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
    }
  }

  // Mutated code
  void wrapperMutant() {
    begin();
    beginWrapper();
    end();
    endWrapper();
  }

  void exception1Mutant(String z) {
    begin();
    int m = z.length();
    end();
  }

  void exception2Mutant(String z) {
    int m = z.length();
    begin();
    end();
  }

  void exception3Mutant(String z) {
    begin();
    try {
      int m = z.length();
    } finally {
      end();
    }
  }

  void infiniteMutant(int e) {
    int b = 0;
    begin();
    begin();
    while (b < e) {
      end();
      begin();
      b++;
    }
    end();
    end();
  }

  void nondetMutant(int y) {
    if (y > 0) {
      begin();
    } else {
    }
    end(); // too many end/stop
  }

  void growMutant(int e) {
    int b = 0;
    while (b < e) {
      begin();
    }
  }

  void testBoolMutant(String z) {
    boolean f = z.length() == 4;
    if (f) {
      begin();
    }

    if (f) {
      f = false;
    } else {
      f = true;
    }

    if (!f) {
      end();
    }
  }

  void testBoolLoop1Mutant(String z) {
    boolean f = true;
    while (z.length() == 4) {
      if (f) {
        begin();
        f = false;
      } else {
        end();
        f = true;
      }
    }
    if (!f) {
      end();
    }
  }

  void testBoolLoop2Mutant(String z) {
    boolean f = true;
    try {
      while (z.length() == 4) {
        if (f) {
          begin();
          f = false;
        } else {
          end();
          f = true;
        }
      }
    } finally {
      if (!f) {
        end();
      }
    }
  }
}