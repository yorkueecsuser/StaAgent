class ThreadSensitivity {

  Object monitorA, monitorB;

  void conditionalAssertMainThread_Bad(boolean b) {
    if (b) {
      // this branch asserts on Main thread
      OurThreadUtils.assertMainThread();
      synchronized (monitorA) {
        synchronized (monitorB) {
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable while loop
          }
        }
      }
    } else {
      // this branch asserts nothing, so may run in parallel with the other branch
      synchronized (monitorB) {
        synchronized (monitorA) {
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable while loop
          }
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
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable while loop
          }
        }
      }
    }
  }

  void conditionalIsUiThread_Ok() {
    if (OurThreadUtils.isUiThread()) {
      synchronized (monitorD) {
        synchronized (monitorC) {
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable while loop
          }
        }
      }
    }
  }

  Object monitorE, monitorF;

  // identical to the first case above but negated
  void conditionalNegatedIsMainThread_Bad() {
    if (!OurThreadUtils.isMainThread()) {
      synchronized (monitorE) {
        synchronized (monitorF) {
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable while loop
          }
        }
      }
    } else {
      synchronized (monitorF) {
        synchronized (monitorE) {
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable while loop
          }
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
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable while loop
          }
        }
      }
    } else {
      synchronized (monitorH) {
        synchronized (monitorG) {
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable while loop
          }
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
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable while loop
          }
        }
      }
    }

    if (b) {
      synchronized (monitorJ) {
        synchronized (monitorI) {
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable while loop
          }
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}