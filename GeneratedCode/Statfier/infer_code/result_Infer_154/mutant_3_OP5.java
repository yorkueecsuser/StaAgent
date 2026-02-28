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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
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

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // Unreachable code
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}