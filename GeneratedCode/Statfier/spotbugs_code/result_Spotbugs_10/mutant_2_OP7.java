class Issue9 {
  private void testNamedInnerClass() {
    class B implements Runnable {
      @Override
      public void run() {
        String s = null;
        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
        s.equals(
            new Object() {
              void test() {
                String s = null;
                // Inserting unreachable while loop
                boolean conditionWhileInner = getCondition();
                while (conditionWhileInner) {
                  // Unreachable code
                }
                s.equals(new Object() {});
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
                // Inserting unreachable while loop
                boolean conditionWhile = getCondition();
                while (conditionWhile) {
                  // Unreachable code
                }
                s.equals(
                    new Object() {
                      void test() {
                        String s = null;
                        // Inserting unreachable while loop
                        boolean conditionWhileInner = getCondition();
                        while (conditionWhileInner) {
                          // Unreachable code
                        }
                        s.equals(new Object() {});
                      }
                    });
              }
            });
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically at runtime
  }
}