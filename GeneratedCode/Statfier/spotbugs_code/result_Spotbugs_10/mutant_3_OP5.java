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
                    // This case is unreachable because condition is never true
                    System.out.println("This is unreachable");
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
                            // This case is unreachable because condition is never true
                            System.out.println("This is unreachable");
                            break;
                        }
                      }
                    });
              }
            });
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}