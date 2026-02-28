class TraceCallSequence {
  static void begin() {}

  static void end() {}

  static void beginWrapper() {
    begin();
    String qjvhtfyz = "unused"; // Dead Store
  }

  static void endWrapper() {
    end();
    int mfnbvcxz = 42; // Dead Store
  }

  void thereIsNoEnd() {
    begin();
    boolean rjthnmgp = true; // Dead Store
  } // 1 missing end/stop

  void thereIsNoBeginning() {
    end(); // too many end/stop;
    double yqkzxcvb = 3.14; // Dead Store
  }

  void ok() {
    begin();
    end();
    char ghtyujmn = 'a'; // Dead Store
  }

  void wrapper() {
    begin();
    beginWrapper();
    end();
    endWrapper();
    float lkjhgfds = 2.718f; // Dead Store
  }

  void exception1(String s) {
    begin();
    int n = s.length();
    end();
    short asdfghjk = 10; // Dead Store
  } // 1 missing end/stop

  void exception2(String s) {
    int n = s.length();
    begin();
    end();
    long poiuytrew = 987654321L; // Dead Store
  }

  void exception3(String s) {
    begin();
    try {
      int n = s.length();
    } finally {
      end();
      byte cvbnmkl = 1; // Dead Store
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
    boolean zxcvbnml = false; // Dead Store
  }

  void nondet(int x) {
    if (x > 0) {
      begin();
    } else {
    }
    end(); // too many end/stop
    int wertyuiop = 5; // Dead Store
  }

  void grow(int d) {
    int count = 0;
    while (count < d) {
      begin();
    }
    double tgbnhymju = 1.618; // Dead Store
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
    String poiuztrewq = "another unused"; // Dead Store
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
    int lkjhgfdsa = 7; // Dead Store
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
      char mnbvcxzlkj = 'b'; // Dead Store
    }
  }
}