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

                // Inserting unreachable while loop
                boolean conditionWhile = getCondition();
                while (conditionWhile) {
                  // Unreachable code
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

                        // Inserting unreachable while loop
                        boolean conditionWhile = getCondition();
                        while (conditionWhile) {
                          // Unreachable code
                        }
                      }
                    });
              }
            });
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, making the loop condition dynamically determined
  }
}