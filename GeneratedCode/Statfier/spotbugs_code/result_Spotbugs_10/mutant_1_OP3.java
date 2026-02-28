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

        // Introduced unreachable if statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is an unreachable if statement");
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

                // Introduced unreachable if statement
                boolean condition = getCondition();
                if (condition) {
                  System.out.println("This is an unreachable if statement in anonymous class");
                }
              }
            });
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}