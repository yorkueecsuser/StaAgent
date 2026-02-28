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

  // Mutated Code
  void thereIsNoEnd_b() {
    begin();
  } // 1 missing end/stop

  void thereIsNoBeginning_c() {
    end(); // too many end/stop;
  }

  void ok_d() {
    begin();
    end();
  }

  void wrapper_e() {
    begin();
    beginWrapper();
    end();
    endWrapper();
  }

  void exception1_f(String g) {
    begin();
    int h = g.length();
    end();
  } // 1 missing end/stop

  void exception2_i(String j) {
    int k = j.length();
    begin();
    end();
  }

  void exception3_l(String m) {
    begin();
    try {
      int n = m.length();
    } finally {
      end();
    }
  }

  void infinite_o(int p) {
    int q = 0;
    begin();
    begin();
    while (q < p) {
      end();
      begin();
      q++;
    }
    end();
    end();
  }

  void nondet_r(int s) {
    if (s > 0) {
      begin();
    } else {
    }
    end(); // too many end/stop
  }

  void grow_t(int u) {
    int v = 0;
    while (v < u) {
      begin();
    }
  } // 2 missing end/stop

  void testBool_w(String x) {
    boolean y = x.length() == 4;
    if (y) {
      begin();
    }

    if (y) {
      y = false;
    } else {
      y = true;
    }

    if (!y) {
      end();
    }
  }

  void testBoolLoop1_z(String a) {
    boolean b = true;
    while (a.length() == 4) {
      if (b) {
        begin();
        b = false;
      } else {
        end();
        b = true;
      }
    }
    if (!b) {
      end();
    }
  } // 1 missing end/stop

  void testBoolLoop2_c(String d) {
    boolean e = true;
    try {
      while (d.length() == 4) {
        if (e) {
          begin();
          e = false;
        } else {
          end();
          e = true;
        }
      }
    } finally {
      if (!e) {
        end();
      }
    }
  }
}