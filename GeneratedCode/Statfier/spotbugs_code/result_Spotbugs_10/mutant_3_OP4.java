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

        // Mutant: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block will never execute because shouldRun is always false
          System.out.println("This is an unreachable block");
        } else {
          // This block will also never execute because shouldRun is always false
          System.out.println("This is another unreachable block");
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

                // Mutant: Inserting an unreachable if-else statement
                boolean shouldRun = getCondition();
                if (shouldRun) {
                  // This block will never execute because shouldRun is always false
                  System.out.println("This is an unreachable block");
                } else {
                  // This block will also never execute because shouldRun is always false
                  System.out.println("This is another unreachable block");
                }
              }
            });
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}