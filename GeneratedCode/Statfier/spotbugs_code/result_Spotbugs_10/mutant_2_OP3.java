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

                // Mutant code: Unreachable if statement
                boolean condition = getCondition();
                if (condition) {
                  System.out.println("This is an unreachable statement");
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

                        // Mutant code: Unreachable if statement
                        boolean condition = getCondition();
                        if (condition) {
                          System.out.println("This is another unreachable statement");
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