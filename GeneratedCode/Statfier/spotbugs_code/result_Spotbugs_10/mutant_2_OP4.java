class Issue9 {
  private void testNamedInnerClass() {
    class B implements Runnable {
      @Override
      public void run() {
        String s = null;
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Original code remains intact
          s.equals(
              new Object() {
                void test() {
                  String s = null;
                  s.equals(new Object() {});
                }
              });
        } else {
          // Unreachable else block
          System.out.println("This is an unreachable else block");
        }
      }
    }
  }

  private void testAnonymousClass() {
    Thread t =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                String s = null;
                boolean shouldRun = getCondition();
                if (shouldRun) {
                  // Original code remains intact
                  s.equals(
                      new Object() {
                        void test() {
                          String s = null;
                          s.equals(new Object() {});
                        }
                      });
                } else {
                  // Unreachable else block
                  System.out.println("This is an unreachable else block");
                }
              }
            });
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false based on runtime logic
  }
}