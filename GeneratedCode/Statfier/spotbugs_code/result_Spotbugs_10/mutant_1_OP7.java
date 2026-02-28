class Issue9 {
  private void testNamedInnerClass() {
    class B implements Runnable {
      @Override
      public void run() {
        String s = null;
        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
          System.out.println("This is an unreachable loop");
        }
        s.equals(
            new Object() {
              void test() {
                String s = null;
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
                // Introduced unreachable while loop
                boolean conditionWhile = getCondition();
                while (conditionWhile) {
                  // Unreachable code
                  System.out.println("This is another unreachable loop");
                }
                s.equals(
                    new Object() {
                      void test() {
                        String s = null;
                        s.equals(new Object() {});
                      }
                    });
              }
            });
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the loop is unreachable
  }
}