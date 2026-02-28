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
      // Mutation: Duplicate the assignment statement for monitorA
      monitorA = monitorA;
    } else {
      // this branch asserts nothing, so may run in parallel with the other branch
      synchronized (monitorB) {
        synchronized (monitorA) {
        }
      }
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
      // Mutation: Duplicate the assignment statement for monitorC
      monitorC = monitorC;
    }
  }

  void conditionalIsUiThread_Ok() {
    if (OurThreadUtils.isUiThread()) {
      synchronized (monitorD) {
        synchronized (monitorC) {
        }
      }
      // Mutation: Duplicate the assignment statement for monitorD
      monitorD = monitorD;
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
      // Mutation: Duplicate the assignment statement for monitorE
      monitorE = monitorE;
    } else {
      synchronized (monitorF) {
        synchronized (monitorE) {
        }
      }
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
      // Mutation: Duplicate the assignment statement for monitorG
      monitorG = monitorG;
    } else {
      synchronized (monitorH) {
        synchronized (monitorG) {
        }
      }
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
      // Mutation: Duplicate the assignment statement for monitorI
      monitorI = monitorI;
    }

    if (b) {
      synchronized (monitorJ) {
        synchronized (monitorI) {
        }
      }
      // Mutation: Duplicate the assignment statement for monitorJ
      monitorJ = monitorJ;
    }
  }
}