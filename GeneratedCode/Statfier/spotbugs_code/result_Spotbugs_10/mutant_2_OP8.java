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
      }
    }
    // Mutant
    class C implements Runnable {
      @Override
      public void run() {
        String x = null;
        x.equals(
            new Object() {
              void test() {
                String y = null;
                y.equals(new Object() {});
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
                      }
                    });
              }
            });
    // Mutant
    Thread u =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                String v = null;
                v.equals(
                    new Object() {
                      void test() {
                        String w = null;
                        w.equals(new Object() {});
                      }
                    });
              }
            });
  }
}