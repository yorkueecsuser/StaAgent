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

                // Mutant: Inserting unreachable if-else statement
                boolean shouldRun = getCondition();
                if (shouldRun) {
                  System.out.println("This is reachable");
                } else {
                  System.out.println("This is unreachable");
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

                        // Mutant: Inserting unreachable if-else statement
                        boolean shouldRun = getCondition();
                        if (shouldRun) {
                          System.out.println("This is reachable");
                        } else {
                          System.out.println("This is unreachable");
                        }
                      }
                    });
              }
            });
  }

  // Helper method to simulate a dynamic condition
  private boolean getCondition() {
    return true; // This ensures the if block is reachable and the else block is unreachable
  }
}