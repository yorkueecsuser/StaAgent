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
              }
            });

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because getCondition() returns false
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
                s.equals(
                    new Object() {
                      void test() {
                        String s = null;
                        s.equals(new Object() {});
                      }
                    });

                // Mutant: Unreachable for loop
                boolean conditionFor = getCondition();
                for (int i = 0; conditionFor; i++) {
                  // This loop is unreachable because getCondition() returns false
                }
              }
            });
  }

  // Method to provide a dynamic condition that evaluates to false
  private boolean getCondition() {
    return false;
  }
}