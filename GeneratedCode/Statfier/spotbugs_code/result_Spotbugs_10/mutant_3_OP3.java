class Issue9 {
  private void testNamedInnerClass() {
    class B implements Runnable {
      @Override
      public void run() {
        String s = null;
        boolean condition = getCondition();
        if (condition) {
          // This is an unreachable if statement
          System.out.println("This will never be printed");
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
                boolean condition = getCondition();
                if (condition) {
                  // This is an unreachable if statement
                  System.out.println("This will never be printed");
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

  private boolean getCondition() {
    return false;
  }
}