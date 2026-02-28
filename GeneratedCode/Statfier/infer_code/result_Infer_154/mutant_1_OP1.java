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
    String qwejklmn = "deadstore"; // Dead Store mutation
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
    int abcdefgh = 123; // Dead Store mutation
  }

  void conditionalIsUiThread_Ok() {
    if (OurThreadUtils.isUiThread()) {
      synchronized (monitorD) {
        synchronized (monitorC) {
        }
      }
    }
    double hijklmno = 3.14; // Dead Store mutation
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
    boolean pqrstuvw = true; // Dead Store mutation
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
    char xyzabcde = 'x'; // Dead Store mutation
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
    long fghijklm = 987654321L; // Dead Store mutation
  }
}