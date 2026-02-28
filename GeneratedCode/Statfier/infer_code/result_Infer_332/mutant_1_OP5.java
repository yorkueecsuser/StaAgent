class TraceCallSequence {
  static void begin() {}

  static void end() {}

  static void beginWrapper() {
    begin();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  static void endWrapper() {
    end();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void thereIsNoEnd() {
    begin();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  } // 1 missing end/stop

  void thereIsNoBeginning() {
    end(); // too many end/stop;
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void ok() {
    begin();
    end();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void wrapper() {
    begin();
    beginWrapper();
    end();
    endWrapper();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void exception1(String s) {
    begin();
    int n = s.length();
    end();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  } // 1 missing end/stop

  void exception2(String s) {
    int n = s.length();
    begin();
    end();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void exception3(String s) {
    begin();
    try {
      int n = s.length();
    } finally {
      end();
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
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
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void nondet(int x) {
    if (x > 0) {
      begin();
    } else {
    }
    end(); // too many end/stop
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  void grow(int d) {
    int count = 0;
    while (count < d) {
      begin();
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
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
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
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
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
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
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}