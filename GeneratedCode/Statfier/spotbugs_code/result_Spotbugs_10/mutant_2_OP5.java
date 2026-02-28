class Issue9 {
  private void testNamedInnerClass() {
    class B implements Runnable {
      @Override
      public void run() {
        String s = null;
        s.equals(
            new Object() {
              void test() {
                String s = null;
                s.equals(new Object() {});

                // Inserting unreachable switch statement
                boolean condition = getCondition();
                switch (condition? 0 : 1) {
                  case 0:
                    // This case is unreachable because condition is always false
                    System.out.println("Unreachable case 0");
                    break;
                  case 1:
                    // This case is reachable
                    System.out.println("Reachable case 1");
                    break;
                }
              }
            });
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
                s.equals(
                    new Object() {
                      void test() {
                        String s = null;
                        s.equals(new Object() {});

                        // Inserting unreachable switch statement
                        boolean condition = getCondition();
                        switch (condition? 0 : 1) {
                          case 0:
                            // This case is unreachable because condition is always false
                            System.out.println("Unreachable case 0");
                            break;
                          case 1:
                            // This case is reachable
                            System.out.println("Reachable case 1");
                            break;
                        }
                      }
                    });
              }
            });
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}