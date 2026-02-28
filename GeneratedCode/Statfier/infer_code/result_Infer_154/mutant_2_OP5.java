class ThreadSensitivity {

  Object monitorA, monitorB;

  void conditionalAssertMainThread_Bad(boolean b) {
    if (b) {
      // this branch asserts on Main thread
      OurThreadUtils.assertMainThread();
      synchronized (monitorA) {
        synchronized (monitorB) {
        }
      }
    } else {
      // this branch asserts nothing, so may run in parallel with the other branch
      synchronized (monitorB) {
        synchronized (monitorA) {
        }
      }
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case 1:
        // This case is unreachable because getCondition() never returns 1
        System.out.println("This is unreachable");
        break;
    }
  }

  Object monitorC, monitorD;

  // the branches in the following two methods are both on main/UI thread so cannot deadlock

  void conditionalIsMainThread_Ok() {
    if (OurThreadUtils.isMainThread()) {
      synchronized (monitorC) {
        synchronized (monitorD) {
        }
      }
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case 2:
        // This case is unreachable because getCondition() never returns 2
        System.out.println("This is unreachable");
        break;
    }
  }

  void conditionalIsUiThread_Ok() {
    if (OurThreadUtils.isUiThread()) {
      synchronized (monitorD) {
        synchronized (monitorC) {
        }
      }
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case 3:
        // This case is unreachable because getCondition() never returns 3
        System.out.println("This is unreachable");
        break;
    }
  }

  Object monitorE, monitorF;

  // identical to the first case above but negated
  void conditionalNegatedIsMainThread_Bad() {
    if (!OurThreadUtils.isMainThread()) {
      synchronized (monitorE) {
        synchronized (monitorF) {
        }
      }
    } else {
      synchronized (monitorF) {
        synchronized (monitorE) {
        }
      }
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case 4:
        // This case is unreachable because getCondition() never returns 4
        System.out.println("This is unreachable");
        break;
    }
  }

  Object monitorG, monitorH;

  public void confusedAssertBad(boolean b, boolean c) {
    if (b) {
      OurThreadUtils.assertOnBackgroundThread();
    } else {
      OurThreadUtils.assertOnUiThread();
    }

    // not sure if we're on UI or background, should report
    if (c) {
      synchronized (monitorG) {
        synchronized (monitorH) {
        }
      }
    } else {
      synchronized (monitorH) {
        synchronized (monitorG) {
        }
      }
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case 5:
        // This case is unreachable because getCondition() never returns 5
        System.out.println("This is unreachable");
        break;
    }
  }

  Object monitorI, monitorJ;

  public void FP_confusedAssertOk(boolean b) {
    if (b) {
      OurThreadUtils.assertOnBackgroundThread();
    }

    // b determines if running on UI thread, should NOT report
    if (b) {
      synchronized (monitorI) {
        synchronized (monitorJ) {
        }
      }
    }

    if (b) {
      synchronized (monitorJ) {
        synchronized (monitorI) {
        }
      }
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case 6:
        // This case is unreachable because getCondition() never returns 6
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to provide a condition that never evaluates to the specific case values used
  private boolean getCondition() {
    return false; // This will always be false, ensuring the switch cases are unreachable
  }
}