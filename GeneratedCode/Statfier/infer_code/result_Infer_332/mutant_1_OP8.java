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
  void wrapperMutated() {
    begin();
    beginWrapper();
    end();
    endWrapper();
  }

  void exception1Mutated(String a) {
    begin();
    int b = a.length();
    end();
  } // 1 missing end/stop

  void exception2Mutated(String a) {
    int b = a.length();
    begin();
    end();
  }

  void exception3Mutated(String a) {
    begin();
    try {
      int b = a.length();
    } finally {
      end();
    }
  }

  void infiniteMutated(int e) {
    int f = 0;
    begin();
    begin();
    while (f < e) {
      end();
      begin();
      f++;
    }
    end();
    end();
  }

  void nondetMutated(int y) {
    if (y > 0) {
      begin();
    } else {
    }
    end(); // too many end/stop
  }

  void growMutated(int e) {
    int f = 0;
    while (f < e) {
      begin();
    }
  } // 2 missing end/stop

  void testBoolMutated(String a) {
    boolean c = a.length() == 4;
    if (c) {
      begin();
    }

    if (c) {
      c = false;
    } else {
      c = true;
    }

    if (!c) {
      end();
    }
  }

  void testBoolLoop1Mutated(String a) {
    boolean c = true;
    while (a.length() == 4) {
      if (c) {
        begin();
        c = false;
      } else {
        end();
        c = true;
      }
    }
    if (!c) {
      end();
    }
  } // 1 missing end/stop

  void testBoolLoop2Mutated(String a) {
    boolean c = true;
    try {
      while (a.length() == 4) {
        if (c) {
          begin();
          c = false;
        } else {
          end();
          c = true;
        }
      }
    } finally {
      if (!c) {
        end();
      }
    }
  }
}