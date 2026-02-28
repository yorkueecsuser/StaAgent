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

    // Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable
      System.out.println("This is another unreachable block");
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

    // Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable
      System.out.println("This is another unreachable block");
    }
  }

  void conditionalIsUiThread_Ok() {
    if (OurThreadUtils.isUiThread()) {
      synchronized (monitorD) {
        synchronized (monitorC) {
        }
      }
    }

    // Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable
      System.out.println("This is another unreachable block");
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

    // Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable
      System.out.println("This is another unreachable block");
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

    // Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable
      System.out.println("This is another unreachable block");
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

    // Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    } else {
      // This block is also unreachable
      System.out.println("This is another unreachable block");
    }
  }
}