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
    // Mutant 1: Renaming variable's' to 'a'
    class C implements Runnable {
      @Override
      public void run() {
        String a = null;
        a.equals(
            new Object() {
              void test() {
                String a = null;
                a.equals(new Object() {});
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
    // Mutant 2: Renaming variable's' to 'b'
    Thread u =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                String b = null;
                b.equals(
                    new Object() {
                      void test() {
                        String b = null;
                        b.equals(new Object() {});
                      }
                    });
              }
            });
  }
}